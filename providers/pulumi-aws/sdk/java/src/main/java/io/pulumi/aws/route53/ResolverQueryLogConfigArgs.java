// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverQueryLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverQueryLogConfigArgs Empty = new ResolverQueryLogConfigArgs();

    /**
     * The ARN of the resource that you want Route 53 Resolver to send query logs.
     * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     * 
     */
    @Import(name="destinationArn", required=true)
      private final Output<String> destinationArn;

    public Output<String> getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * The name of the Route 53 Resolver query logging configuration.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ResolverQueryLogConfigArgs(
        Output<String> destinationArn,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.destinationArn = Objects.requireNonNull(destinationArn, "expected parameter 'destinationArn' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private ResolverQueryLogConfigArgs() {
        this.destinationArn = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverQueryLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destinationArn;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverQueryLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder destinationArn(Output<String> destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }
        public Builder destinationArn(String destinationArn) {
            this.destinationArn = Output.of(Objects.requireNonNull(destinationArn));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ResolverQueryLogConfigArgs build() {
            return new ResolverQueryLogConfigArgs(destinationArn, name, tags);
        }
    }
}