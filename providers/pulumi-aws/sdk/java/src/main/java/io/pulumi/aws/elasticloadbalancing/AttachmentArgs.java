// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttachmentArgs Empty = new AttachmentArgs();

    /**
     * The name of the ELB.
     * 
     */
    @Import(name="elb", required=true)
      private final Output<String> elb;

    public Output<String> getElb() {
        return this.elb;
    }

    /**
     * Instance ID to place in the ELB pool.
     * 
     */
    @Import(name="instance", required=true)
      private final Output<String> instance;

    public Output<String> getInstance() {
        return this.instance;
    }

    public AttachmentArgs(
        Output<String> elb,
        Output<String> instance) {
        this.elb = Objects.requireNonNull(elb, "expected parameter 'elb' to be non-null");
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
    }

    private AttachmentArgs() {
        this.elb = Output.empty();
        this.instance = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> elb;
        private Output<String> instance;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elb = defaults.elb;
    	      this.instance = defaults.instance;
        }

        public Builder elb(Output<String> elb) {
            this.elb = Objects.requireNonNull(elb);
            return this;
        }
        public Builder elb(String elb) {
            this.elb = Output.of(Objects.requireNonNull(elb));
            return this;
        }
        public Builder instance(Output<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }
        public Builder instance(String instance) {
            this.instance = Output.of(Objects.requireNonNull(instance));
            return this;
        }        public AttachmentArgs build() {
            return new AttachmentArgs(elb, instance);
        }
    }
}
