// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceLevelObjectiveArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceLevelObjectiveArgs Empty = new GetServiceLevelObjectiveArgs();

    @Import(name="serviceId", required=true)
      private final String serviceId;

    public String getServiceId() {
        return this.serviceId;
    }

    @Import(name="serviceLevelObjectiveId", required=true)
      private final String serviceLevelObjectiveId;

    public String getServiceLevelObjectiveId() {
        return this.serviceLevelObjectiveId;
    }

    @Import(name="v3Id", required=true)
      private final String v3Id;

    public String getV3Id() {
        return this.v3Id;
    }

    @Import(name="v3Id1", required=true)
      private final String v3Id1;

    public String getV3Id1() {
        return this.v3Id1;
    }

    @Import(name="view")
      private final @Nullable String view;

    public Optional<String> getView() {
        return this.view == null ? Optional.empty() : Optional.ofNullable(this.view);
    }

    public GetServiceLevelObjectiveArgs(
        String serviceId,
        String serviceLevelObjectiveId,
        String v3Id,
        String v3Id1,
        @Nullable String view) {
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
        this.serviceLevelObjectiveId = Objects.requireNonNull(serviceLevelObjectiveId, "expected parameter 'serviceLevelObjectiveId' to be non-null");
        this.v3Id = Objects.requireNonNull(v3Id, "expected parameter 'v3Id' to be non-null");
        this.v3Id1 = Objects.requireNonNull(v3Id1, "expected parameter 'v3Id1' to be non-null");
        this.view = view;
    }

    private GetServiceLevelObjectiveArgs() {
        this.serviceId = null;
        this.serviceLevelObjectiveId = null;
        this.v3Id = null;
        this.v3Id1 = null;
        this.view = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceLevelObjectiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serviceId;
        private String serviceLevelObjectiveId;
        private String v3Id;
        private String v3Id1;
        private @Nullable String view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceLevelObjectiveArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceId = defaults.serviceId;
    	      this.serviceLevelObjectiveId = defaults.serviceLevelObjectiveId;
    	      this.v3Id = defaults.v3Id;
    	      this.v3Id1 = defaults.v3Id1;
    	      this.view = defaults.view;
        }

        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder serviceLevelObjectiveId(String serviceLevelObjectiveId) {
            this.serviceLevelObjectiveId = Objects.requireNonNull(serviceLevelObjectiveId);
            return this;
        }
        public Builder v3Id(String v3Id) {
            this.v3Id = Objects.requireNonNull(v3Id);
            return this;
        }
        public Builder v3Id1(String v3Id1) {
            this.v3Id1 = Objects.requireNonNull(v3Id1);
            return this;
        }
        public Builder view(@Nullable String view) {
            this.view = view;
            return this;
        }        public GetServiceLevelObjectiveArgs build() {
            return new GetServiceLevelObjectiveArgs(serviceId, serviceLevelObjectiveId, v3Id, v3Id1, view);
        }
    }
}
