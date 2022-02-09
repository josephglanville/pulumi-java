// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServersProjectSummaryResponse {
    private final @Nullable Integer assessedCount;
    private final @Nullable Integer discoveredCount;
    private final @Nullable Map<String,String> extendedSummary;
    private final String instanceType;
    private final @Nullable String lastSummaryRefreshedTime;
    private final @Nullable Integer migratedCount;
    private final @Nullable String refreshSummaryState;
    private final @Nullable Integer replicatingCount;
    private final @Nullable Integer testMigratedCount;

    @OutputCustomType.Constructor({"assessedCount","discoveredCount","extendedSummary","instanceType","lastSummaryRefreshedTime","migratedCount","refreshSummaryState","replicatingCount","testMigratedCount"})
    private ServersProjectSummaryResponse(
        @Nullable Integer assessedCount,
        @Nullable Integer discoveredCount,
        @Nullable Map<String,String> extendedSummary,
        String instanceType,
        @Nullable String lastSummaryRefreshedTime,
        @Nullable Integer migratedCount,
        @Nullable String refreshSummaryState,
        @Nullable Integer replicatingCount,
        @Nullable Integer testMigratedCount) {
        this.assessedCount = assessedCount;
        this.discoveredCount = discoveredCount;
        this.extendedSummary = extendedSummary;
        this.instanceType = Objects.requireNonNull(instanceType);
        this.lastSummaryRefreshedTime = lastSummaryRefreshedTime;
        this.migratedCount = migratedCount;
        this.refreshSummaryState = refreshSummaryState;
        this.replicatingCount = replicatingCount;
        this.testMigratedCount = testMigratedCount;
    }

    public Optional<Integer> getAssessedCount() {
        return Optional.ofNullable(this.assessedCount);
    }
    public Optional<Integer> getDiscoveredCount() {
        return Optional.ofNullable(this.discoveredCount);
    }
    public Map<String,String> getExtendedSummary() {
        return this.extendedSummary == null ? Map.of() : this.extendedSummary;
    }
    public String getInstanceType() {
        return this.instanceType;
    }
    public Optional<String> getLastSummaryRefreshedTime() {
        return Optional.ofNullable(this.lastSummaryRefreshedTime);
    }
    public Optional<Integer> getMigratedCount() {
        return Optional.ofNullable(this.migratedCount);
    }
    public Optional<String> getRefreshSummaryState() {
        return Optional.ofNullable(this.refreshSummaryState);
    }
    public Optional<Integer> getReplicatingCount() {
        return Optional.ofNullable(this.replicatingCount);
    }
    public Optional<Integer> getTestMigratedCount() {
        return Optional.ofNullable(this.testMigratedCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServersProjectSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer assessedCount;
        private @Nullable Integer discoveredCount;
        private @Nullable Map<String,String> extendedSummary;
        private String instanceType;
        private @Nullable String lastSummaryRefreshedTime;
        private @Nullable Integer migratedCount;
        private @Nullable String refreshSummaryState;
        private @Nullable Integer replicatingCount;
        private @Nullable Integer testMigratedCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ServersProjectSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessedCount = defaults.assessedCount;
    	      this.discoveredCount = defaults.discoveredCount;
    	      this.extendedSummary = defaults.extendedSummary;
    	      this.instanceType = defaults.instanceType;
    	      this.lastSummaryRefreshedTime = defaults.lastSummaryRefreshedTime;
    	      this.migratedCount = defaults.migratedCount;
    	      this.refreshSummaryState = defaults.refreshSummaryState;
    	      this.replicatingCount = defaults.replicatingCount;
    	      this.testMigratedCount = defaults.testMigratedCount;
        }

        public Builder setAssessedCount(@Nullable Integer assessedCount) {
            this.assessedCount = assessedCount;
            return this;
        }

        public Builder setDiscoveredCount(@Nullable Integer discoveredCount) {
            this.discoveredCount = discoveredCount;
            return this;
        }

        public Builder setExtendedSummary(@Nullable Map<String,String> extendedSummary) {
            this.extendedSummary = extendedSummary;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setLastSummaryRefreshedTime(@Nullable String lastSummaryRefreshedTime) {
            this.lastSummaryRefreshedTime = lastSummaryRefreshedTime;
            return this;
        }

        public Builder setMigratedCount(@Nullable Integer migratedCount) {
            this.migratedCount = migratedCount;
            return this;
        }

        public Builder setRefreshSummaryState(@Nullable String refreshSummaryState) {
            this.refreshSummaryState = refreshSummaryState;
            return this;
        }

        public Builder setReplicatingCount(@Nullable Integer replicatingCount) {
            this.replicatingCount = replicatingCount;
            return this;
        }

        public Builder setTestMigratedCount(@Nullable Integer testMigratedCount) {
            this.testMigratedCount = testMigratedCount;
            return this;
        }

        public ServersProjectSummaryResponse build() {
            return new ServersProjectSummaryResponse(assessedCount, discoveredCount, extendedSummary, instanceType, lastSummaryRefreshedTime, migratedCount, refreshSummaryState, replicatingCount, testMigratedCount);
        }
    }
}
