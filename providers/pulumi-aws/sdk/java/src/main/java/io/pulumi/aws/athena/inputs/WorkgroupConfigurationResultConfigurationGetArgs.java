// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena.inputs;

import io.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationEncryptionConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkgroupConfigurationResultConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkgroupConfigurationResultConfigurationGetArgs Empty = new WorkgroupConfigurationResultConfigurationGetArgs();

    /**
     * Configuration block with encryption settings. Documented below.
     * 
     */
    @Import(name="encryptionConfiguration")
      private final @Nullable Output<WorkgroupConfigurationResultConfigurationEncryptionConfigurationGetArgs> encryptionConfiguration;

    public Output<WorkgroupConfigurationResultConfigurationEncryptionConfigurationGetArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Output.empty() : this.encryptionConfiguration;
    }

    /**
     * The location in Amazon S3 where your query results are stored, such as `s3://path/to/query/bucket/`. For more information, see [Queries and Query Result Files](https://docs.aws.amazon.com/athena/latest/ug/querying.html).
     * 
     */
    @Import(name="outputLocation")
      private final @Nullable Output<String> outputLocation;

    public Output<String> getOutputLocation() {
        return this.outputLocation == null ? Output.empty() : this.outputLocation;
    }

    public WorkgroupConfigurationResultConfigurationGetArgs(
        @Nullable Output<WorkgroupConfigurationResultConfigurationEncryptionConfigurationGetArgs> encryptionConfiguration,
        @Nullable Output<String> outputLocation) {
        this.encryptionConfiguration = encryptionConfiguration;
        this.outputLocation = outputLocation;
    }

    private WorkgroupConfigurationResultConfigurationGetArgs() {
        this.encryptionConfiguration = Output.empty();
        this.outputLocation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkgroupConfigurationResultConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WorkgroupConfigurationResultConfigurationEncryptionConfigurationGetArgs> encryptionConfiguration;
        private @Nullable Output<String> outputLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkgroupConfigurationResultConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.outputLocation = defaults.outputLocation;
        }

        public Builder encryptionConfiguration(@Nullable Output<WorkgroupConfigurationResultConfigurationEncryptionConfigurationGetArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }
        public Builder encryptionConfiguration(@Nullable WorkgroupConfigurationResultConfigurationEncryptionConfigurationGetArgs encryptionConfiguration) {
            this.encryptionConfiguration = Output.ofNullable(encryptionConfiguration);
            return this;
        }
        public Builder outputLocation(@Nullable Output<String> outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }
        public Builder outputLocation(@Nullable String outputLocation) {
            this.outputLocation = Output.ofNullable(outputLocation);
            return this;
        }        public WorkgroupConfigurationResultConfigurationGetArgs build() {
            return new WorkgroupConfigurationResultConfigurationGetArgs(encryptionConfiguration, outputLocation);
        }
    }
}
