// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PersistenceConfigResponse {
    private final String persistenceMode;
    private final String rdbNextSnapshotTime;
    private final String rdbSnapshotPeriod;
    private final String rdbSnapshotStartTime;

    @OutputCustomType.Constructor({"persistenceMode","rdbNextSnapshotTime","rdbSnapshotPeriod","rdbSnapshotStartTime"})
    private PersistenceConfigResponse(
        String persistenceMode,
        String rdbNextSnapshotTime,
        String rdbSnapshotPeriod,
        String rdbSnapshotStartTime) {
        this.persistenceMode = Objects.requireNonNull(persistenceMode);
        this.rdbNextSnapshotTime = Objects.requireNonNull(rdbNextSnapshotTime);
        this.rdbSnapshotPeriod = Objects.requireNonNull(rdbSnapshotPeriod);
        this.rdbSnapshotStartTime = Objects.requireNonNull(rdbSnapshotStartTime);
    }

    public String getPersistenceMode() {
        return this.persistenceMode;
    }
    public String getRdbNextSnapshotTime() {
        return this.rdbNextSnapshotTime;
    }
    public String getRdbSnapshotPeriod() {
        return this.rdbSnapshotPeriod;
    }
    public String getRdbSnapshotStartTime() {
        return this.rdbSnapshotStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistenceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String persistenceMode;
        private String rdbNextSnapshotTime;
        private String rdbSnapshotPeriod;
        private String rdbSnapshotStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistenceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.persistenceMode = defaults.persistenceMode;
    	      this.rdbNextSnapshotTime = defaults.rdbNextSnapshotTime;
    	      this.rdbSnapshotPeriod = defaults.rdbSnapshotPeriod;
    	      this.rdbSnapshotStartTime = defaults.rdbSnapshotStartTime;
        }

        public Builder setPersistenceMode(String persistenceMode) {
            this.persistenceMode = Objects.requireNonNull(persistenceMode);
            return this;
        }

        public Builder setRdbNextSnapshotTime(String rdbNextSnapshotTime) {
            this.rdbNextSnapshotTime = Objects.requireNonNull(rdbNextSnapshotTime);
            return this;
        }

        public Builder setRdbSnapshotPeriod(String rdbSnapshotPeriod) {
            this.rdbSnapshotPeriod = Objects.requireNonNull(rdbSnapshotPeriod);
            return this;
        }

        public Builder setRdbSnapshotStartTime(String rdbSnapshotStartTime) {
            this.rdbSnapshotStartTime = Objects.requireNonNull(rdbSnapshotStartTime);
            return this;
        }

        public PersistenceConfigResponse build() {
            return new PersistenceConfigResponse(persistenceMode, rdbNextSnapshotTime, rdbSnapshotPeriod, rdbSnapshotStartTime);
        }
    }
}