package com.github.clanhouse.tinderforprojects.tinderforprojects.entities;

import com.github.clanhouse.tinderforprojects.tinderforprojects.entities.model.StampedModel;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "table_to_matches")
@Data
public class TableToMatch extends StampedModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    private Developer developer;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    private Project project;

    @Column(name = "is_match")
    boolean isMatch;

    @Column(name = "is_like")
    boolean isLike;

    @PrePersist
    public void prePersist(){
        isLike = true;
    }
}