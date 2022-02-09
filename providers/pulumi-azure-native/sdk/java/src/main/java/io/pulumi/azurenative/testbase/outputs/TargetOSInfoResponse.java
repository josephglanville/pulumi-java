// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TargetOSInfoResponse {
    private final String osUpdateType;
    private final List<String> targetOSs;

    @OutputCustomType.Constructor({"osUpdateType","targetOSs"})
    private TargetOSInfoResponse(
        String osUpdateType,
        List<String> targetOSs) {
        this.osUpdateType = Objects.requireNonNull(osUpdateType);
        this.targetOSs = Objects.requireNonNull(targetOSs);
    }

    public String getOsUpdateType() {
        return this.osUpdateType;
    }
    public List<String> getTargetOSs() {
        return this.targetOSs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetOSInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osUpdateType;
        private List<String> targetOSs;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetOSInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osUpdateType = defaults.osUpdateType;
    	      this.targetOSs = defaults.targetOSs;
        }

        public Builder setOsUpdateType(String osUpdateType) {
            this.osUpdateType = Objects.requireNonNull(osUpdateType);
            return this;
        }

        public Builder setTargetOSs(List<String> targetOSs) {
            this.targetOSs = Objects.requireNonNull(targetOSs);
            return this;
        }

        public TargetOSInfoResponse build() {
            return new TargetOSInfoResponse(osUpdateType, targetOSs);
        }
    }
}
