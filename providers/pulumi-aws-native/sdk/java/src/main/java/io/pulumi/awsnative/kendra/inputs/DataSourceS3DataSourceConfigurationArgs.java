// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceAccessControlListConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceDocumentsMetadataConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * S3 data source configuration
 * 
 */
public final class DataSourceS3DataSourceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceS3DataSourceConfigurationArgs Empty = new DataSourceS3DataSourceConfigurationArgs();

    @Import(name="accessControlListConfiguration")
      private final @Nullable Output<DataSourceAccessControlListConfigurationArgs> accessControlListConfiguration;

    public Output<DataSourceAccessControlListConfigurationArgs> getAccessControlListConfiguration() {
        return this.accessControlListConfiguration == null ? Output.empty() : this.accessControlListConfiguration;
    }

    @Import(name="bucketName", required=true)
      private final Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName;
    }

    @Import(name="documentsMetadataConfiguration")
      private final @Nullable Output<DataSourceDocumentsMetadataConfigurationArgs> documentsMetadataConfiguration;

    public Output<DataSourceDocumentsMetadataConfigurationArgs> getDocumentsMetadataConfiguration() {
        return this.documentsMetadataConfiguration == null ? Output.empty() : this.documentsMetadataConfiguration;
    }

    @Import(name="exclusionPatterns")
      private final @Nullable Output<List<String>> exclusionPatterns;

    public Output<List<String>> getExclusionPatterns() {
        return this.exclusionPatterns == null ? Output.empty() : this.exclusionPatterns;
    }

    @Import(name="inclusionPatterns")
      private final @Nullable Output<List<String>> inclusionPatterns;

    public Output<List<String>> getInclusionPatterns() {
        return this.inclusionPatterns == null ? Output.empty() : this.inclusionPatterns;
    }

    @Import(name="inclusionPrefixes")
      private final @Nullable Output<List<String>> inclusionPrefixes;

    public Output<List<String>> getInclusionPrefixes() {
        return this.inclusionPrefixes == null ? Output.empty() : this.inclusionPrefixes;
    }

    public DataSourceS3DataSourceConfigurationArgs(
        @Nullable Output<DataSourceAccessControlListConfigurationArgs> accessControlListConfiguration,
        Output<String> bucketName,
        @Nullable Output<DataSourceDocumentsMetadataConfigurationArgs> documentsMetadataConfiguration,
        @Nullable Output<List<String>> exclusionPatterns,
        @Nullable Output<List<String>> inclusionPatterns,
        @Nullable Output<List<String>> inclusionPrefixes) {
        this.accessControlListConfiguration = accessControlListConfiguration;
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.documentsMetadataConfiguration = documentsMetadataConfiguration;
        this.exclusionPatterns = exclusionPatterns;
        this.inclusionPatterns = inclusionPatterns;
        this.inclusionPrefixes = inclusionPrefixes;
    }

    private DataSourceS3DataSourceConfigurationArgs() {
        this.accessControlListConfiguration = Output.empty();
        this.bucketName = Output.empty();
        this.documentsMetadataConfiguration = Output.empty();
        this.exclusionPatterns = Output.empty();
        this.inclusionPatterns = Output.empty();
        this.inclusionPrefixes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceS3DataSourceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DataSourceAccessControlListConfigurationArgs> accessControlListConfiguration;
        private Output<String> bucketName;
        private @Nullable Output<DataSourceDocumentsMetadataConfigurationArgs> documentsMetadataConfiguration;
        private @Nullable Output<List<String>> exclusionPatterns;
        private @Nullable Output<List<String>> inclusionPatterns;
        private @Nullable Output<List<String>> inclusionPrefixes;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceS3DataSourceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlListConfiguration = defaults.accessControlListConfiguration;
    	      this.bucketName = defaults.bucketName;
    	      this.documentsMetadataConfiguration = defaults.documentsMetadataConfiguration;
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.inclusionPrefixes = defaults.inclusionPrefixes;
        }

        public Builder accessControlListConfiguration(@Nullable Output<DataSourceAccessControlListConfigurationArgs> accessControlListConfiguration) {
            this.accessControlListConfiguration = accessControlListConfiguration;
            return this;
        }
        public Builder accessControlListConfiguration(@Nullable DataSourceAccessControlListConfigurationArgs accessControlListConfiguration) {
            this.accessControlListConfiguration = Output.ofNullable(accessControlListConfiguration);
            return this;
        }
        public Builder bucketName(Output<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder bucketName(String bucketName) {
            this.bucketName = Output.of(Objects.requireNonNull(bucketName));
            return this;
        }
        public Builder documentsMetadataConfiguration(@Nullable Output<DataSourceDocumentsMetadataConfigurationArgs> documentsMetadataConfiguration) {
            this.documentsMetadataConfiguration = documentsMetadataConfiguration;
            return this;
        }
        public Builder documentsMetadataConfiguration(@Nullable DataSourceDocumentsMetadataConfigurationArgs documentsMetadataConfiguration) {
            this.documentsMetadataConfiguration = Output.ofNullable(documentsMetadataConfiguration);
            return this;
        }
        public Builder exclusionPatterns(@Nullable Output<List<String>> exclusionPatterns) {
            this.exclusionPatterns = exclusionPatterns;
            return this;
        }
        public Builder exclusionPatterns(@Nullable List<String> exclusionPatterns) {
            this.exclusionPatterns = Output.ofNullable(exclusionPatterns);
            return this;
        }
        public Builder exclusionPatterns(String... exclusionPatterns) {
            return exclusionPatterns(List.of(exclusionPatterns));
        }
        public Builder inclusionPatterns(@Nullable Output<List<String>> inclusionPatterns) {
            this.inclusionPatterns = inclusionPatterns;
            return this;
        }
        public Builder inclusionPatterns(@Nullable List<String> inclusionPatterns) {
            this.inclusionPatterns = Output.ofNullable(inclusionPatterns);
            return this;
        }
        public Builder inclusionPatterns(String... inclusionPatterns) {
            return inclusionPatterns(List.of(inclusionPatterns));
        }
        public Builder inclusionPrefixes(@Nullable Output<List<String>> inclusionPrefixes) {
            this.inclusionPrefixes = inclusionPrefixes;
            return this;
        }
        public Builder inclusionPrefixes(@Nullable List<String> inclusionPrefixes) {
            this.inclusionPrefixes = Output.ofNullable(inclusionPrefixes);
            return this;
        }
        public Builder inclusionPrefixes(String... inclusionPrefixes) {
            return inclusionPrefixes(List.of(inclusionPrefixes));
        }        public DataSourceS3DataSourceConfigurationArgs build() {
            return new DataSourceS3DataSourceConfigurationArgs(accessControlListConfiguration, bucketName, documentsMetadataConfiguration, exclusionPatterns, inclusionPatterns, inclusionPrefixes);
        }
    }
}
