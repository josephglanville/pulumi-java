// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceNode {
    private final String id;
    private final String zone;

    @CustomType.Constructor
    private GetInstanceNode(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("zone") String zone) {
        this.id = id;
        this.zone = zone;
    }

    public String getId() {
        return this.id;
    }
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.zone = defaults.zone;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetInstanceNode build() {
            return new GetInstanceNode(id, zone);
        }
    }
}
