package com.rtf.rms.rms.candidates;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {

//    @Query(nativeQuery = true,q )
//    Optional<Candidate> findCandidatesWithRating();
}
