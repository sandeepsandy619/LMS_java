package com.blackflower.curriculumcreator.jpa.model;

import com.blackflower.curriculumcreator.jpa.model.InstructorLesson;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-12T17:27:00", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Instructor.class)
public class Instructor_ extends Person_ {

    public static volatile ListAttribute<Instructor, InstructorLesson> LessonList;

}