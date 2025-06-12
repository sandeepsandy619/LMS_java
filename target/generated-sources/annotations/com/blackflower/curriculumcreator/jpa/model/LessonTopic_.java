package com.blackflower.curriculumcreator.jpa.model;

import com.blackflower.curriculumcreator.jpa.model.Lesson;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-12T19:06:32", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(LessonTopic.class)
public class LessonTopic_ { 

    public static volatile SingularAttribute<LessonTopic, Integer> week;
    public static volatile SingularAttribute<LessonTopic, String> topic;
    public static volatile SingularAttribute<LessonTopic, Lesson> lessonId;
    public static volatile SingularAttribute<LessonTopic, Integer> id;

}