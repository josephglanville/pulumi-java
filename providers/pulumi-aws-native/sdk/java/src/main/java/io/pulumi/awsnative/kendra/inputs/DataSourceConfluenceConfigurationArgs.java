// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceConfluenceVersion;
import io.pulumi.awsnative.kendra.inputs.DataSourceConfluenceAttachmentConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceConfluenceBlogConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceConfluencePageConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceConfluenceSpaceConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceVpcConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceConfluenceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceConfluenceConfigurationArgs Empty = new DataSourceConfluenceConfigurationArgs();

    @InputImport(name="attachmentConfiguration")
      private final @Nullable Output<DataSourceConfluenceAttachmentConfigurationArgs> attachmentConfiguration;

    public Output<DataSourceConfluenceAttachmentConfigurationArgs> getAttachmentConfiguration() {
        return this.attachmentConfiguration == null ? Output.empty() : this.attachmentConfiguration;
    }

    @InputImport(name="blogConfiguration")
      private final @Nullable Output<DataSourceConfluenceBlogConfigurationArgs> blogConfiguration;

    public Output<DataSourceConfluenceBlogConfigurationArgs> getBlogConfiguration() {
        return this.blogConfiguration == null ? Output.empty() : this.blogConfiguration;
    }

    @InputImport(name="exclusionPatterns")
      private final @Nullable Output<List<String>> exclusionPatterns;

    public Output<List<String>> getExclusionPatterns() {
        return this.exclusionPatterns == null ? Output.empty() : this.exclusionPatterns;
    }

    @InputImport(name="inclusionPatterns")
      private final @Nullable Output<List<String>> inclusionPatterns;

    public Output<List<String>> getInclusionPatterns() {
        return this.inclusionPatterns == null ? Output.empty() : this.inclusionPatterns;
    }

    @InputImport(name="pageConfiguration")
      private final @Nullable Output<DataSourceConfluencePageConfigurationArgs> pageConfiguration;

    public Output<DataSourceConfluencePageConfigurationArgs> getPageConfiguration() {
        return this.pageConfiguration == null ? Output.empty() : this.pageConfiguration;
    }

    @InputImport(name="secretArn", required=true)
      private final Output<String> secretArn;

    public Output<String> getSecretArn() {
        return this.secretArn;
    }

    @InputImport(name="serverUrl", required=true)
      private final Output<String> serverUrl;

    public Output<String> getServerUrl() {
        return this.serverUrl;
    }

    @InputImport(name="spaceConfiguration")
      private final @Nullable Output<DataSourceConfluenceSpaceConfigurationArgs> spaceConfiguration;

    public Output<DataSourceConfluenceSpaceConfigurationArgs> getSpaceConfiguration() {
        return this.spaceConfiguration == null ? Output.empty() : this.spaceConfiguration;
    }

    @InputImport(name="version", required=true)
      private final Output<DataSourceConfluenceVersion> version;

    public Output<DataSourceConfluenceVersion> getVersion() {
        return this.version;
    }

    @InputImport(name="vpcConfiguration")
      private final @Nullable Output<DataSourceVpcConfigurationArgs> vpcConfiguration;

    public Output<DataSourceVpcConfigurationArgs> getVpcConfiguration() {
        return this.vpcConfiguration == null ? Output.empty() : this.vpcConfiguration;
    }

    public DataSourceConfluenceConfigurationArgs(
        @Nullable Output<DataSourceConfluenceAttachmentConfigurationArgs> attachmentConfiguration,
        @Nullable Output<DataSourceConfluenceBlogConfigurationArgs> blogConfiguration,
        @Nullable Output<List<String>> exclusionPatterns,
        @Nullable Output<List<String>> inclusionPatterns,
        @Nullable Output<DataSourceConfluencePageConfigurationArgs> pageConfiguration,
        Output<String> secretArn,
        Output<String> serverUrl,
        @Nullable Output<DataSourceConfluenceSpaceConfigurationArgs> spaceConfiguration,
        Output<DataSourceConfluenceVersion> version,
        @Nullable Output<DataSourceVpcConfigurationArgs> vpcConfiguration) {
        this.attachmentConfiguration = attachmentConfiguration;
        this.blogConfiguration = blogConfiguration;
        this.exclusionPatterns = exclusionPatterns;
        this.inclusionPatterns = inclusionPatterns;
        this.pageConfiguration = pageConfiguration;
        this.secretArn = Objects.requireNonNull(secretArn, "expected parameter 'secretArn' to be non-null");
        this.serverUrl = Objects.requireNonNull(serverUrl, "expected parameter 'serverUrl' to be non-null");
        this.spaceConfiguration = spaceConfiguration;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
        this.vpcConfiguration = vpcConfiguration;
    }

    private DataSourceConfluenceConfigurationArgs() {
        this.attachmentConfiguration = Output.empty();
        this.blogConfiguration = Output.empty();
        this.exclusionPatterns = Output.empty();
        this.inclusionPatterns = Output.empty();
        this.pageConfiguration = Output.empty();
        this.secretArn = Output.empty();
        this.serverUrl = Output.empty();
        this.spaceConfiguration = Output.empty();
        this.version = Output.empty();
        this.vpcConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluenceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DataSourceConfluenceAttachmentConfigurationArgs> attachmentConfiguration;
        private @Nullable Output<DataSourceConfluenceBlogConfigurationArgs> blogConfiguration;
        private @Nullable Output<List<String>> exclusionPatterns;
        private @Nullable Output<List<String>> inclusionPatterns;
        private @Nullable Output<DataSourceConfluencePageConfigurationArgs> pageConfiguration;
        private Output<String> secretArn;
        private Output<String> serverUrl;
        private @Nullable Output<DataSourceConfluenceSpaceConfigurationArgs> spaceConfiguration;
        private Output<DataSourceConfluenceVersion> version;
        private @Nullable Output<DataSourceVpcConfigurationArgs> vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluenceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentConfiguration = defaults.attachmentConfiguration;
    	      this.blogConfiguration = defaults.blogConfiguration;
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.pageConfiguration = defaults.pageConfiguration;
    	      this.secretArn = defaults.secretArn;
    	      this.serverUrl = defaults.serverUrl;
    	      this.spaceConfiguration = defaults.spaceConfiguration;
    	      this.version = defaults.version;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder attachmentConfiguration(@Nullable Output<DataSourceConfluenceAttachmentConfigurationArgs> attachmentConfiguration) {
            this.attachmentConfiguration = attachmentConfiguration;
            return this;
        }

        public Builder attachmentConfiguration(@Nullable DataSourceConfluenceAttachmentConfigurationArgs attachmentConfiguration) {
            this.attachmentConfiguration = Output.ofNullable(attachmentConfiguration);
            return this;
        }

        public Builder blogConfiguration(@Nullable Output<DataSourceConfluenceBlogConfigurationArgs> blogConfiguration) {
            this.blogConfiguration = blogConfiguration;
            return this;
        }

        public Builder blogConfiguration(@Nullable DataSourceConfluenceBlogConfigurationArgs blogConfiguration) {
            this.blogConfiguration = Output.ofNullable(blogConfiguration);
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

        public Builder inclusionPatterns(@Nullable Output<List<String>> inclusionPatterns) {
            this.inclusionPatterns = inclusionPatterns;
            return this;
        }

        public Builder inclusionPatterns(@Nullable List<String> inclusionPatterns) {
            this.inclusionPatterns = Output.ofNullable(inclusionPatterns);
            return this;
        }

        public Builder pageConfiguration(@Nullable Output<DataSourceConfluencePageConfigurationArgs> pageConfiguration) {
            this.pageConfiguration = pageConfiguration;
            return this;
        }

        public Builder pageConfiguration(@Nullable DataSourceConfluencePageConfigurationArgs pageConfiguration) {
            this.pageConfiguration = Output.ofNullable(pageConfiguration);
            return this;
        }

        public Builder secretArn(Output<String> secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder secretArn(String secretArn) {
            this.secretArn = Output.of(Objects.requireNonNull(secretArn));
            return this;
        }

        public Builder serverUrl(Output<String> serverUrl) {
            this.serverUrl = Objects.requireNonNull(serverUrl);
            return this;
        }

        public Builder serverUrl(String serverUrl) {
            this.serverUrl = Output.of(Objects.requireNonNull(serverUrl));
            return this;
        }

        public Builder spaceConfiguration(@Nullable Output<DataSourceConfluenceSpaceConfigurationArgs> spaceConfiguration) {
            this.spaceConfiguration = spaceConfiguration;
            return this;
        }

        public Builder spaceConfiguration(@Nullable DataSourceConfluenceSpaceConfigurationArgs spaceConfiguration) {
            this.spaceConfiguration = Output.ofNullable(spaceConfiguration);
            return this;
        }

        public Builder version(Output<DataSourceConfluenceVersion> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder version(DataSourceConfluenceVersion version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }

        public Builder vpcConfiguration(@Nullable Output<DataSourceVpcConfigurationArgs> vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }

        public Builder vpcConfiguration(@Nullable DataSourceVpcConfigurationArgs vpcConfiguration) {
            this.vpcConfiguration = Output.ofNullable(vpcConfiguration);
            return this;
        }
        public DataSourceConfluenceConfigurationArgs build() {
            return new DataSourceConfluenceConfigurationArgs(attachmentConfiguration, blogConfiguration, exclusionPatterns, inclusionPatterns, pageConfiguration, secretArn, serverUrl, spaceConfiguration, version, vpcConfiguration);
        }
    }
}
