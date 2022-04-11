// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.aws.cfg.inputs.ConformancePackInputParameterGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConformancePackState extends io.pulumi.resources.ResourceArgs {

    public static final ConformancePackState Empty = new ConformancePackState();

    /**
     * Amazon Resource Name (ARN) of the conformance pack.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Amazon S3 bucket where AWS Config stores conformance pack templates. Maximum length of 63.
     * 
     */
    @Import(name="deliveryS3Bucket")
      private final @Nullable Output<String> deliveryS3Bucket;

    public Output<String> getDeliveryS3Bucket() {
        return this.deliveryS3Bucket == null ? Codegen.empty() : this.deliveryS3Bucket;
    }

    /**
     * The prefix for the Amazon S3 bucket. Maximum length of 1024.
     * 
     */
    @Import(name="deliveryS3KeyPrefix")
      private final @Nullable Output<String> deliveryS3KeyPrefix;

    public Output<String> getDeliveryS3KeyPrefix() {
        return this.deliveryS3KeyPrefix == null ? Codegen.empty() : this.deliveryS3KeyPrefix;
    }

    /**
     * Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `template_body` or in the template stored in Amazon S3 if using `template_s3_uri`.
     * 
     */
    @Import(name="inputParameters")
      private final @Nullable Output<List<ConformancePackInputParameterGetArgs>> inputParameters;

    public Output<List<ConformancePackInputParameterGetArgs>> getInputParameters() {
        return this.inputParameters == null ? Codegen.empty() : this.inputParameters;
    }

    /**
     * The name of the conformance pack. Must begin with a letter and contain from 1 to 256 alphanumeric characters and hyphens.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A string containing full conformance pack template body. Maximum length of 51200. Drift detection is not possible with this argument.
     * 
     */
    @Import(name="templateBody")
      private final @Nullable Output<String> templateBody;

    public Output<String> getTemplateBody() {
        return this.templateBody == null ? Codegen.empty() : this.templateBody;
    }

    /**
     * Location of file, e.g., `s3://bucketname/prefix`, containing the template body. The uri must point to the conformance pack template that is located in an Amazon S3 bucket in the same region as the conformance pack. Maximum length of 1024. Drift detection is not possible with this argument.
     * 
     */
    @Import(name="templateS3Uri")
      private final @Nullable Output<String> templateS3Uri;

    public Output<String> getTemplateS3Uri() {
        return this.templateS3Uri == null ? Codegen.empty() : this.templateS3Uri;
    }

    public ConformancePackState(
        @Nullable Output<String> arn,
        @Nullable Output<String> deliveryS3Bucket,
        @Nullable Output<String> deliveryS3KeyPrefix,
        @Nullable Output<List<ConformancePackInputParameterGetArgs>> inputParameters,
        @Nullable Output<String> name,
        @Nullable Output<String> templateBody,
        @Nullable Output<String> templateS3Uri) {
        this.arn = arn;
        this.deliveryS3Bucket = deliveryS3Bucket;
        this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
        this.inputParameters = inputParameters;
        this.name = name;
        this.templateBody = templateBody;
        this.templateS3Uri = templateS3Uri;
    }

    private ConformancePackState() {
        this.arn = Codegen.empty();
        this.deliveryS3Bucket = Codegen.empty();
        this.deliveryS3KeyPrefix = Codegen.empty();
        this.inputParameters = Codegen.empty();
        this.name = Codegen.empty();
        this.templateBody = Codegen.empty();
        this.templateS3Uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConformancePackState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> deliveryS3Bucket;
        private @Nullable Output<String> deliveryS3KeyPrefix;
        private @Nullable Output<List<ConformancePackInputParameterGetArgs>> inputParameters;
        private @Nullable Output<String> name;
        private @Nullable Output<String> templateBody;
        private @Nullable Output<String> templateS3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ConformancePackState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.deliveryS3Bucket = defaults.deliveryS3Bucket;
    	      this.deliveryS3KeyPrefix = defaults.deliveryS3KeyPrefix;
    	      this.inputParameters = defaults.inputParameters;
    	      this.name = defaults.name;
    	      this.templateBody = defaults.templateBody;
    	      this.templateS3Uri = defaults.templateS3Uri;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder deliveryS3Bucket(@Nullable Output<String> deliveryS3Bucket) {
            this.deliveryS3Bucket = deliveryS3Bucket;
            return this;
        }
        public Builder deliveryS3Bucket(@Nullable String deliveryS3Bucket) {
            this.deliveryS3Bucket = Codegen.ofNullable(deliveryS3Bucket);
            return this;
        }
        public Builder deliveryS3KeyPrefix(@Nullable Output<String> deliveryS3KeyPrefix) {
            this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
            return this;
        }
        public Builder deliveryS3KeyPrefix(@Nullable String deliveryS3KeyPrefix) {
            this.deliveryS3KeyPrefix = Codegen.ofNullable(deliveryS3KeyPrefix);
            return this;
        }
        public Builder inputParameters(@Nullable Output<List<ConformancePackInputParameterGetArgs>> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }
        public Builder inputParameters(@Nullable List<ConformancePackInputParameterGetArgs> inputParameters) {
            this.inputParameters = Codegen.ofNullable(inputParameters);
            return this;
        }
        public Builder inputParameters(ConformancePackInputParameterGetArgs... inputParameters) {
            return inputParameters(List.of(inputParameters));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder templateBody(@Nullable Output<String> templateBody) {
            this.templateBody = templateBody;
            return this;
        }
        public Builder templateBody(@Nullable String templateBody) {
            this.templateBody = Codegen.ofNullable(templateBody);
            return this;
        }
        public Builder templateS3Uri(@Nullable Output<String> templateS3Uri) {
            this.templateS3Uri = templateS3Uri;
            return this;
        }
        public Builder templateS3Uri(@Nullable String templateS3Uri) {
            this.templateS3Uri = Codegen.ofNullable(templateS3Uri);
            return this;
        }        public ConformancePackState build() {
            return new ConformancePackState(arn, deliveryS3Bucket, deliveryS3KeyPrefix, inputParameters, name, templateBody, templateS3Uri);
        }
    }
}
