// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.enums.ServiceCorrelationScheme;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Creates a particular correlation between services.
 * 
 */
public final class ServiceCorrelationDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceCorrelationDescriptionArgs Empty = new ServiceCorrelationDescriptionArgs();

    /**
     * The ServiceCorrelationScheme which describes the relationship between this service and the service specified via ServiceName.
     * 
     */
    @InputImport(name="scheme", required=true)
      private final Input<Either<String,ServiceCorrelationScheme>> scheme;

    public Input<Either<String,ServiceCorrelationScheme>> getScheme() {
        return this.scheme;
    }

    /**
     * The name of the service that the correlation relationship is established with.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    public ServiceCorrelationDescriptionArgs(
        Input<Either<String,ServiceCorrelationScheme>> scheme,
        Input<String> serviceName) {
        this.scheme = Objects.requireNonNull(scheme, "expected parameter 'scheme' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ServiceCorrelationDescriptionArgs() {
        this.scheme = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCorrelationDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,ServiceCorrelationScheme>> scheme;
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCorrelationDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheme = defaults.scheme;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setScheme(Input<Either<String,ServiceCorrelationScheme>> scheme) {
            this.scheme = Objects.requireNonNull(scheme);
            return this;
        }

        public Builder setScheme(Either<String,ServiceCorrelationScheme> scheme) {
            this.scheme = Input.of(Objects.requireNonNull(scheme));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public ServiceCorrelationDescriptionArgs build() {
            return new ServiceCorrelationDescriptionArgs(scheme, serviceName);
        }
    }
}
