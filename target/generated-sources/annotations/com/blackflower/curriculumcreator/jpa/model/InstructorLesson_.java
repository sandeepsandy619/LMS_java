package com.blackflower.curriculumcreator.jpa.model;

import com.blackflower.curriculumcreator.jpa.model.Instructor;
import com.blackflower.curriculumcreator.jpa.model.Lesson;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-12T17:27:00", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(InstructorLesson.class)
public class InstructorLesson_ { 

    public static volatile SingularAttribute<InstructorLesson, Integer> lessonCount;
    public static volatile SingularAttribute<InstructorLesson, Lesson> lessonId;
    public static volatile SingularAttribute<InstructorLesson, Integer> id;
    public static volatile SingularAttribute<InstructorLesson, Instructor> instructorId;

}