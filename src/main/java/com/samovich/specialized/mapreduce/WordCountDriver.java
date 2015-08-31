/**
 * @file WordCountDriver.java
 * @author Valery Samovich
 * @version 0.0.1
 * @date 2015/01/09
 */

package com.samovich.specialized.mapreduce;

import java.io.IOException;
import java.util.Formatter;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

/**
 * WordCountDriver Class is the main class.
 * Created by Valery Samovich on 8/26/15.
 */
public class WordCountDriver {

    public static void main(String[] args) throws IOException {

        InterruptedException, ClassNotFoundException {
            Configuration conf = new Configuration();
            GenericOptionsParser parser = new GenericOptionsParser(conf, args);
            args = parser.getRemainingArgs();

            Job job = new Job(conf, "wordcount");

            job.setJarByClass(WordCountDriver.class);

            job.setOutputKeyClass(Text.class);
            job.setOutputValueClass(IntWritable.class);

            job.setInputFormatClass(TextInputFormat.class);
            job.setOutputFormatClass(TextOutputFormat.class);

            Formatter formatter = new Formatter();
            FileInputFormat.setInputPaths(job, new Path(args[0]));
            FileOutputFormat.setOutputPath(job, new Path(args[1]));
            job.setMapperClass(WordCountMapper.class);
            job.setReducerClass(WordCountReducer.class);

            System.out.println(job.waitForCompletion(true));
        }
}
