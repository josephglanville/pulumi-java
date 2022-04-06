// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetVpcEndpointServiceFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcEndpointServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVpcEndpointServiceArgs Empty = new GetVpcEndpointServiceArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetVpcEndpointServiceFilter> filters;

    public List<GetVpcEndpointServiceFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The common name of an AWS service (e.g., `s3`).
     * 
     */
    @Import(name="service")
      private final @Nullable String service;

    public Optional<String> getService() {
        return this.service == null ? Optional.empty() : Optional.ofNullable(this.service);
    }

    /**
     * The service name that is specified when creating a VPC endpoint. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
     * 
     */
    @Import(name="serviceName")
      private final @Nullable String serviceName;

    public Optional<String> getServiceName() {
        return this.serviceName == null ? Optional.empty() : Optional.ofNullable(this.serviceName);
    }

    /**
     * The service type, `Gateway` or `Interface`.
     * 
     */
    @Import(name="serviceType")
      private final @Nullable String serviceType;

    public Optional<String> getServiceType() {
        return this.serviceType == null ? Optional.empty() : Optional.ofNullable(this.serviceType);
    }

    /**
     * A map of tags, each pair of which must exactly match a pair on the desired VPC Endpoint Service.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetVpcEndpointServiceArgs(
        @Nullable List<GetVpcEndpointServiceFilter> filters,
        @Nullable String service,
        @Nullable String serviceName,
        @Nullable String serviceType,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.service = service;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.tags = tags;
    }

    private GetVpcEndpointServiceArgs() {
        this.filters = List.of();
        this.service = null;
        this.serviceName = null;
        this.serviceType = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetVpcEndpointServiceFilter> filters;
        private @Nullable String service;
        private @Nullable String serviceName;
        private @Nullable String serviceType;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcEndpointServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.service = defaults.service;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceType = defaults.serviceType;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetVpcEndpointServiceFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVpcEndpointServiceFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder service(@Nullable String service) {
            this.service = service;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceType(@Nullable String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetVpcEndpointServiceArgs build() {
            return new GetVpcEndpointServiceArgs(filters, service, serviceName, serviceType, tags);
        }
    }
}