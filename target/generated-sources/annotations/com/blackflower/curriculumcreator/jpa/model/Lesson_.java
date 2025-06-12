package com.blackflower.curriculumcreator.jpa.model;

import com.blackflower.curriculumcreator.jpa.model.CourseSession;
import com.blackflower.curriculumcreator.jpa.model.InstructorLesson;
import com.blackflower.curriculumcreator.jpa.model.LessonTopic;
import com.blackflower.curriculumcreator.jpa.model.StudentClass;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-12T17:27:00", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Lesson.class)
public class Lesson_ { 

    public static volatile ListAttribute<Lesson, StudentClass> studentClasses;
    public static volatile ListAttribute<Lesson, LessonTopic> lessonTopicList;
    public static volatile ListAttribute<Lesson, InstructorLesson> instructorLessonList;
    public static volatile SingularAttribute<Lesson, String> name;
    public static volatile ListAttribute<Lesson, CourseSession> coursesessionList;
    public static volatile SingularAttribute<Lesson, Integer> id;

}