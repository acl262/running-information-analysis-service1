package pkg.service;

import pkg.domain.RunningInformation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RunningInformationService {

    public List<RunningInformation> saveRunningInformation(List<RunningInformation> runningInformationList);

    public Page<RunningInformation> findByHeartRate(int heartRate, Pageable pageable);

    public Page<RunningInformation> findByHeartRateGreaterThan(int heartRate, Pageable pageable);

    public Page<RunningInformation> findAllRunningInformationOrderByHeathLevel(Pageable pageable);
    
    public Page<RunningInformation> findByRunnerMovementType(String movementType, Pageable pageable);

    public Page<RunningInformation> findByRunningId(String runningId, Pageable pageable);

    public void deleteAll();
}
