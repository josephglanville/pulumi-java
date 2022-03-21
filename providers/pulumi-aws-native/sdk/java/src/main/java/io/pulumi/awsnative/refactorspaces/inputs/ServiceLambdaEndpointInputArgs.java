// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ServiceLambdaEndpointInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceLambdaEndpointInputArgs Empty = new ServiceLambdaEndpointInputArgs();

    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

    public ServiceLambdaEndpointInputArgs(Output<String> arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private ServiceLambdaEndpointInputArgs() {
        this.arn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLambdaEndpointInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceLambdaEndpointInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }        public ServiceLambdaEndpointInputArgs build() {
            return new ServiceLambdaEndpointInputArgs(arn);
        }
    }
}
