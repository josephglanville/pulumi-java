// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseInstanceClone {
    private final String pointInTime;
    private final String sourceInstanceName;

    @CustomType.Constructor
    private GetDatabaseInstanceClone(
        @CustomType.Parameter("pointInTime") String pointInTime,
        @CustomType.Parameter("sourceInstanceName") String sourceInstanceName) {
        this.pointInTime = pointInTime;
        this.sourceInstanceName = sourceInstanceName;
    }

    public String getPointInTime() {
        return this.pointInTime;
    }
    public String getSourceInstanceName() {
        return this.sourceInstanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceClone defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pointInTime;
        private String sourceInstanceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceClone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pointInTime = defaults.pointInTime;
    	      this.sourceInstanceName = defaults.sourceInstanceName;
        }

        public Builder pointInTime(String pointInTime) {
            this.pointInTime = Objects.requireNonNull(pointInTime);
            return this;
        }
        public Builder sourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = Objects.requireNonNull(sourceInstanceName);
            return this;
        }        public GetDatabaseInstanceClone build() {
            return new GetDatabaseInstanceClone(pointInTime, sourceInstanceName);
        }
    }
}
