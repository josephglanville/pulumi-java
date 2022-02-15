// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublisherArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublisherArgs Empty = new PublisherArgs();

    @InputImport(name="acceptTermsAndConditions", required=true)
    private final Input<Boolean> acceptTermsAndConditions;

    public Input<Boolean> getAcceptTermsAndConditions() {
        return this.acceptTermsAndConditions;
    }

    @InputImport(name="connectionArn")
    private final @Nullable Input<String> connectionArn;

    public Input<String> getConnectionArn() {
        return this.connectionArn == null ? Input.empty() : this.connectionArn;
    }

    public PublisherArgs(
        Input<Boolean> acceptTermsAndConditions,
        @Nullable Input<String> connectionArn) {
        this.acceptTermsAndConditions = Objects.requireNonNull(acceptTermsAndConditions, "expected parameter 'acceptTermsAndConditions' to be non-null");
        this.connectionArn = connectionArn;
    }

    private PublisherArgs() {
        this.acceptTermsAndConditions = Input.empty();
        this.connectionArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublisherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> acceptTermsAndConditions;
        private @Nullable Input<String> connectionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PublisherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptTermsAndConditions = defaults.acceptTermsAndConditions;
    	      this.connectionArn = defaults.connectionArn;
        }

        public Builder setAcceptTermsAndConditions(Input<Boolean> acceptTermsAndConditions) {
            this.acceptTermsAndConditions = Objects.requireNonNull(acceptTermsAndConditions);
            return this;
        }

        public Builder setAcceptTermsAndConditions(Boolean acceptTermsAndConditions) {
            this.acceptTermsAndConditions = Input.of(Objects.requireNonNull(acceptTermsAndConditions));
            return this;
        }

        public Builder setConnectionArn(@Nullable Input<String> connectionArn) {
            this.connectionArn = connectionArn;
            return this;
        }

        public Builder setConnectionArn(@Nullable String connectionArn) {
            this.connectionArn = Input.ofNullable(connectionArn);
            return this;
        }

        public PublisherArgs build() {
            return new PublisherArgs(acceptTermsAndConditions, connectionArn);
        }
    }
}