// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionLoggingConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionLoggingConfigGetArgs Empty = new DistributionLoggingConfigGetArgs();

    /**
     * The Amazon S3 bucket to store the access logs in, for
     * example, `myawslogbucket.s3.amazonaws.com`.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * Specifies whether you want CloudFront to
     * include cookies in access logs (default: `false`).
     * 
     */
    @InputImport(name="includeCookies")
      private final @Nullable Output<Boolean> includeCookies;

    public Output<Boolean> getIncludeCookies() {
        return this.includeCookies == null ? Output.empty() : this.includeCookies;
    }

    /**
     * An optional string that you want CloudFront to prefix
     * to the access log filenames for this distribution, for example, `myprefix/`.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    public DistributionLoggingConfigGetArgs(
        Output<String> bucket,
        @Nullable Output<Boolean> includeCookies,
        @Nullable Output<String> prefix) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.includeCookies = includeCookies;
        this.prefix = prefix;
    }

    private DistributionLoggingConfigGetArgs() {
        this.bucket = Output.empty();
        this.includeCookies = Output.empty();
        this.prefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionLoggingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<Boolean> includeCookies;
        private @Nullable Output<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionLoggingConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.includeCookies = defaults.includeCookies;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder includeCookies(@Nullable Output<Boolean> includeCookies) {
            this.includeCookies = includeCookies;
            return this;
        }

        public Builder includeCookies(@Nullable Boolean includeCookies) {
            this.includeCookies = Output.ofNullable(includeCookies);
            return this;
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }
        public DistributionLoggingConfigGetArgs build() {
            return new DistributionLoggingConfigGetArgs(bucket, includeCookies, prefix);
        }
    }
}
