// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ApplicationEntitlementAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationEntitlementAssociationArgs Empty = new ApplicationEntitlementAssociationArgs();

    @Import(name="applicationIdentifier", required=true)
      private final Output<String> applicationIdentifier;

    public Output<String> getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    @Import(name="entitlementName", required=true)
      private final Output<String> entitlementName;

    public Output<String> getEntitlementName() {
        return this.entitlementName;
    }

    @Import(name="stackName", required=true)
      private final Output<String> stackName;

    public Output<String> getStackName() {
        return this.stackName;
    }

    public ApplicationEntitlementAssociationArgs(
        Output<String> applicationIdentifier,
        Output<String> entitlementName,
        Output<String> stackName) {
        this.applicationIdentifier = Objects.requireNonNull(applicationIdentifier, "expected parameter 'applicationIdentifier' to be non-null");
        this.entitlementName = Objects.requireNonNull(entitlementName, "expected parameter 'entitlementName' to be non-null");
        this.stackName = Objects.requireNonNull(stackName, "expected parameter 'stackName' to be non-null");
    }

    private ApplicationEntitlementAssociationArgs() {
        this.applicationIdentifier = Codegen.empty();
        this.entitlementName = Codegen.empty();
        this.stackName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationEntitlementAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> applicationIdentifier;
        private Output<String> entitlementName;
        private Output<String> stackName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationEntitlementAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationIdentifier = defaults.applicationIdentifier;
    	      this.entitlementName = defaults.entitlementName;
    	      this.stackName = defaults.stackName;
        }

        public Builder applicationIdentifier(Output<String> applicationIdentifier) {
            this.applicationIdentifier = Objects.requireNonNull(applicationIdentifier);
            return this;
        }
        public Builder applicationIdentifier(String applicationIdentifier) {
            this.applicationIdentifier = Output.of(Objects.requireNonNull(applicationIdentifier));
            return this;
        }
        public Builder entitlementName(Output<String> entitlementName) {
            this.entitlementName = Objects.requireNonNull(entitlementName);
            return this;
        }
        public Builder entitlementName(String entitlementName) {
            this.entitlementName = Output.of(Objects.requireNonNull(entitlementName));
            return this;
        }
        public Builder stackName(Output<String> stackName) {
            this.stackName = Objects.requireNonNull(stackName);
            return this;
        }
        public Builder stackName(String stackName) {
            this.stackName = Output.of(Objects.requireNonNull(stackName));
            return this;
        }        public ApplicationEntitlementAssociationArgs build() {
            return new ApplicationEntitlementAssociationArgs(applicationIdentifier, entitlementName, stackName);
        }
    }
}
