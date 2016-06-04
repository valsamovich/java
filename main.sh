#!/usr/bin/env bash

# helper command to run mapreduce (M/R job)
hadoop jar java-technologies-0.0.1-SNAPSHOT.jar com.samovich.specialized.mapreduce.WordCount /user/samov004/java-mapreduce/*.txt /user/samov004/java-mapreduce/output
