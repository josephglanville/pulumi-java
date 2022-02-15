// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagedZonePrivateVisibilityConfigGKEClusterResponse {
    private final String gkeClusterName;
    private final String kind;

    @OutputCustomType.Constructor({"gkeClusterName","kind"})
    private ManagedZonePrivateVisibilityConfigGKEClusterResponse(
        String gkeClusterName,
        String kind) {
        this.gkeClusterName = Objects.requireNonNull(gkeClusterName);
        this.kind = Objects.requireNonNull(kind);
    }

    public String getGkeClusterName() {
        return this.gkeClusterName;
    }
    public String getKind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePrivateVisibilityConfigGKEClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gkeClusterName;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePrivateVisibilityConfigGKEClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusterName = defaults.gkeClusterName;
    	      this.kind = defaults.kind;
        }

        public Builder setGkeClusterName(String gkeClusterName) {
            this.gkeClusterName = Objects.requireNonNull(gkeClusterName);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public ManagedZonePrivateVisibilityConfigGKEClusterResponse build() {
            return new ManagedZonePrivateVisibilityConfigGKEClusterResponse(gkeClusterName, kind);
        }
    }
}