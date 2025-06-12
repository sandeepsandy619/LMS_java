package com.blackflower.curriculumcreator.jpa.model;

import com.blackflower.curriculumcreator.jpa.model.Lesson;
import com.blackflower.curriculumcreator.jpa.model.StudentClass;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-12T19:06:32", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(CourseSession.class)
public class CourseSession_ { 

    public static volatile SingularAttribute<CourseSession, StudentClass> classId;
    public static volatile SingularAttribute<CourseSession, Lesson> lessonId;
    public static volatile SingularAttribute<CourseSession, Integer> id;
    public static volatile SingularAttribute<CourseSession, Integer> sessionLength;
    public static volatile SingularAttribute<CourseSession, Date> startDate;

}