// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ThingPrincipalAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThingPrincipalAttachmentArgs Empty = new ThingPrincipalAttachmentArgs();

    /**
     * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
     * 
     */
    @Import(name="principal", required=true)
      private final Output<String> principal;

    public Output<String> getPrincipal() {
        return this.principal;
    }

    /**
     * The name of the thing.
     * 
     */
    @Import(name="thing", required=true)
      private final Output<String> thing;

    public Output<String> getThing() {
        return this.thing;
    }

    public ThingPrincipalAttachmentArgs(
        Output<String> principal,
        Output<String> thing) {
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
        this.thing = Objects.requireNonNull(thing, "expected parameter 'thing' to be non-null");
    }

    private ThingPrincipalAttachmentArgs() {
        this.principal = Output.empty();
        this.thing = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingPrincipalAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> principal;
        private Output<String> thing;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingPrincipalAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principal = defaults.principal;
    	      this.thing = defaults.thing;
        }

        public Builder principal(Output<String> principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        public Builder principal(String principal) {
            this.principal = Output.of(Objects.requireNonNull(principal));
            return this;
        }
        public Builder thing(Output<String> thing) {
            this.thing = Objects.requireNonNull(thing);
            return this;
        }
        public Builder thing(String thing) {
            this.thing = Output.of(Objects.requireNonNull(thing));
            return this;
        }        public ThingPrincipalAttachmentArgs build() {
            return new ThingPrincipalAttachmentArgs(principal, thing);
        }
    }
}
