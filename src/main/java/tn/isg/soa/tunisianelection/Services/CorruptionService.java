package tn.isg.soa.tunisianelection.Services;

import tn.isg.soa.tunisianelection.Models.Corruption;

import java.util.List;
import java.util.Optional;

public interface CorruptionService {
    void saveCorruption(Corruption corruption);
    void updateCorruption(Corruption corruption);
    List<Corruption>ListCorruption();
    void removeCorruption(Long id);
    public Optional<Corruption>findCorruption(Long id);

}