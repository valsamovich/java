/**
 * Copyright (c) 2017 Valery Samovich
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.samovich.technologies.specialized.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scala.Tuple2;

import java.util.Arrays;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * Example of Word count with Spark.
 * @author  Valery Samovich
 * @see
 */
public class WordCountTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(WordCountTask.class);

    public static void main(String[] args) {
        checkArgument(args.length > 1, "Please provide the path of input file as first parameter.");
        new WordCountTask().run(args[1]);
    }

    /**
     * The task body.
     * @param inputFilePath
     */
    public void run(String inputFilePath) {
        String master = "local[*]";

        SparkConf conf = new SparkConf()
                .setAppName(WordCountTask.class.getName())
                .setMaster(master);
        JavaSparkContext context = new JavaSparkContext(conf);

        context.textFile(inputFilePath)
                .flatMap(text -> Arrays.asList(text.split(" ")).iterator())
                .mapToPair(word -> new Tuple2<>(word, 1))
                .reduceByKey((a, b) -> a + b)
                .foreach(result -> LOGGER.info(
                        String.format("Word [%s] count [%d].", result._1(), result._2)));
    }
}
