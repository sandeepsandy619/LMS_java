package com.blackflower.curriculumcreator.jpa.model;

import com.blackflower.curriculumcreator.jpa.model.CourseSession;
import com.blackflower.curriculumcreator.jpa.model.Lesson;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-12T19:06:32", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(StudentClass.class)
public class StudentClass_ { 

    public static volatile SingularAttribute<StudentClass, String> name;
    public static volatile ListAttribute<StudentClass, CourseSession> coursesessionList;
    public static volatile SingularAttribute<StudentClass, Integer> id;
    public static volatile ListAttribute<StudentClass, Lesson> lessons;

}