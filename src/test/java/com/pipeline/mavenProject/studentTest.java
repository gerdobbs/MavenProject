package com.pipeline.mavenProject;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by meudecc on 15/02/2017.
 */
public class studentTest {
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void belowZero() throws Exception {
        Student std = new Student();
        std.getAttendanceGrade(-1);
    }
}