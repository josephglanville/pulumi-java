// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceSharePointConfigurationSharePointVersion;
import io.pulumi.awsnative.kendra.inputs.DataSourceS3PathArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMappingArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceVpcConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SharePoint configuration
 * 
 */
public final class DataSourceSharePointConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceSharePointConfigurationArgs Empty = new DataSourceSharePointConfigurationArgs();

    @Import(name="crawlAttachments")
      private final @Nullable Output<Boolean> crawlAttachments;

    public Output<Boolean> getCrawlAttachments() {
        return this.crawlAttachments == null ? Output.empty() : this.crawlAttachments;
    }

    @Import(name="disableLocalGroups")
      private final @Nullable Output<Boolean> disableLocalGroups;

    public Output<Boolean> getDisableLocalGroups() {
        return this.disableLocalGroups == null ? Output.empty() : this.disableLocalGroups;
    }

    @Import(name="documentTitleFieldName")
      private final @Nullable Output<String> documentTitleFieldName;

    public Output<String> getDocumentTitleFieldName() {
        return this.documentTitleFieldName == null ? Output.empty() : this.documentTitleFieldName;
    }

    @Import(name="exclusionPatterns")
      private final @Nullable Output<List<String>> exclusionPatterns;

    public Output<List<String>> getExclusionPatterns() {
        return this.exclusionPatterns == null ? Output.empty() : this.exclusionPatterns;
    }

    @Import(name="fieldMappings")
      private final @Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings;

    public Output<List<DataSourceToIndexFieldMappingArgs>> getFieldMappings() {
        return this.fieldMappings == null ? Output.empty() : this.fieldMappings;
    }

    @Import(name="inclusionPatterns")
      private final @Nullable Output<List<String>> inclusionPatterns;

    public Output<List<String>> getInclusionPatterns() {
        return this.inclusionPatterns == null ? Output.empty() : this.inclusionPatterns;
    }

    @Import(name="secretArn", required=true)
      private final Output<String> secretArn;

    public Output<String> getSecretArn() {
        return this.secretArn;
    }

    @Import(name="sharePointVersion", required=true)
      private final Output<DataSourceSharePointConfigurationSharePointVersion> sharePointVersion;

    public Output<DataSourceSharePointConfigurationSharePointVersion> getSharePointVersion() {
        return this.sharePointVersion;
    }

    @Import(name="sslCertificateS3Path")
      private final @Nullable Output<DataSourceS3PathArgs> sslCertificateS3Path;

    public Output<DataSourceS3PathArgs> getSslCertificateS3Path() {
        return this.sslCertificateS3Path == null ? Output.empty() : this.sslCertificateS3Path;
    }

    @Import(name="urls", required=true)
      private final Output<List<String>> urls;

    public Output<List<String>> getUrls() {
        return this.urls;
    }

    @Import(name="useChangeLog")
      private final @Nullable Output<Boolean> useChangeLog;

    public Output<Boolean> getUseChangeLog() {
        return this.useChangeLog == null ? Output.empty() : this.useChangeLog;
    }

    @Import(name="vpcConfiguration")
      private final @Nullable Output<DataSourceVpcConfigurationArgs> vpcConfiguration;

    public Output<DataSourceVpcConfigurationArgs> getVpcConfiguration() {
        return this.vpcConfiguration == null ? Output.empty() : this.vpcConfiguration;
    }

    public DataSourceSharePointConfigurationArgs(
        @Nullable Output<Boolean> crawlAttachments,
        @Nullable Output<Boolean> disableLocalGroups,
        @Nullable Output<String> documentTitleFieldName,
        @Nullable Output<List<String>> exclusionPatterns,
        @Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings,
        @Nullable Output<List<String>> inclusionPatterns,
        Output<String> secretArn,
        Output<DataSourceSharePointConfigurationSharePointVersion> sharePointVersion,
        @Nullable Output<DataSourceS3PathArgs> sslCertificateS3Path,
        Output<List<String>> urls,
        @Nullable Output<Boolean> useChangeLog,
        @Nullable Output<DataSourceVpcConfigurationArgs> vpcConfiguration) {
        this.crawlAttachments = crawlAttachments;
        this.disableLocalGroups = disableLocalGroups;
        this.documentTitleFieldName = documentTitleFieldName;
        this.exclusionPatterns = exclusionPatterns;
        this.fieldMappings = fieldMappings;
        this.inclusionPatterns = inclusionPatterns;
        this.secretArn = Objects.requireNonNull(secretArn, "expected parameter 'secretArn' to be non-null");
        this.sharePointVersion = Objects.requireNonNull(sharePointVersion, "expected parameter 'sharePointVersion' to be non-null");
        this.sslCertificateS3Path = sslCertificateS3Path;
        this.urls = Objects.requireNonNull(urls, "expected parameter 'urls' to be non-null");
        this.useChangeLog = useChangeLog;
        this.vpcConfiguration = vpcConfiguration;
    }

    private DataSourceSharePointConfigurationArgs() {
        this.crawlAttachments = Output.empty();
        this.disableLocalGroups = Output.empty();
        this.documentTitleFieldName = Output.empty();
        this.exclusionPatterns = Output.empty();
        this.fieldMappings = Output.empty();
        this.inclusionPatterns = Output.empty();
        this.secretArn = Output.empty();
        this.sharePointVersion = Output.empty();
        this.sslCertificateS3Path = Output.empty();
        this.urls = Output.empty();
        this.useChangeLog = Output.empty();
        this.vpcConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSharePointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> crawlAttachments;
        private @Nullable Output<Boolean> disableLocalGroups;
        private @Nullable Output<String> documentTitleFieldName;
        private @Nullable Output<List<String>> exclusionPatterns;
        private @Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings;
        private @Nullable Output<List<String>> inclusionPatterns;
        private Output<String> secretArn;
        private Output<DataSourceSharePointConfigurationSharePointVersion> sharePointVersion;
        private @Nullable Output<DataSourceS3PathArgs> sslCertificateS3Path;
        private Output<List<String>> urls;
        private @Nullable Output<Boolean> useChangeLog;
        private @Nullable Output<DataSourceVpcConfigurationArgs> vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSharePointConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlAttachments = defaults.crawlAttachments;
    	      this.disableLocalGroups = defaults.disableLocalGroups;
    	      this.documentTitleFieldName = defaults.documentTitleFieldName;
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.secretArn = defaults.secretArn;
    	      this.sharePointVersion = defaults.sharePointVersion;
    	      this.sslCertificateS3Path = defaults.sslCertificateS3Path;
    	      this.urls = defaults.urls;
    	      this.useChangeLog = defaults.useChangeLog;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder crawlAttachments(@Nullable Output<Boolean> crawlAttachments) {
            this.crawlAttachments = crawlAttachments;
            return this;
        }
        public Builder crawlAttachments(@Nullable Boolean crawlAttachments) {
            this.crawlAttachments = Output.ofNullable(crawlAttachments);
            return this;
        }
        public Builder disableLocalGroups(@Nullable Output<Boolean> disableLocalGroups) {
            this.disableLocalGroups = disableLocalGroups;
            return this;
        }
        public Builder disableLocalGroups(@Nullable Boolean disableLocalGroups) {
            this.disableLocalGroups = Output.ofNullable(disableLocalGroups);
            return this;
        }
        public Builder documentTitleFieldName(@Nullable Output<String> documentTitleFieldName) {
            this.documentTitleFieldName = documentTitleFieldName;
            return this;
        }
        public Builder documentTitleFieldName(@Nullable String documentTitleFieldName) {
            this.documentTitleFieldName = Output.ofNullable(documentTitleFieldName);
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
        public Builder fieldMappings(@Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public Builder fieldMappings(@Nullable List<DataSourceToIndexFieldMappingArgs> fieldMappings) {
            this.fieldMappings = Output.ofNullable(fieldMappings);
            return this;
        }
        public Builder fieldMappings(DataSourceToIndexFieldMappingArgs... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
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
        public Builder secretArn(Output<String> secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }
        public Builder secretArn(String secretArn) {
            this.secretArn = Output.of(Objects.requireNonNull(secretArn));
            return this;
        }
        public Builder sharePointVersion(Output<DataSourceSharePointConfigurationSharePointVersion> sharePointVersion) {
            this.sharePointVersion = Objects.requireNonNull(sharePointVersion);
            return this;
        }
        public Builder sharePointVersion(DataSourceSharePointConfigurationSharePointVersion sharePointVersion) {
            this.sharePointVersion = Output.of(Objects.requireNonNull(sharePointVersion));
            return this;
        }
        public Builder sslCertificateS3Path(@Nullable Output<DataSourceS3PathArgs> sslCertificateS3Path) {
            this.sslCertificateS3Path = sslCertificateS3Path;
            return this;
        }
        public Builder sslCertificateS3Path(@Nullable DataSourceS3PathArgs sslCertificateS3Path) {
            this.sslCertificateS3Path = Output.ofNullable(sslCertificateS3Path);
            return this;
        }
        public Builder urls(Output<List<String>> urls) {
            this.urls = Objects.requireNonNull(urls);
            return this;
        }
        public Builder urls(List<String> urls) {
            this.urls = Output.of(Objects.requireNonNull(urls));
            return this;
        }
        public Builder urls(String... urls) {
            return urls(List.of(urls));
        }
        public Builder useChangeLog(@Nullable Output<Boolean> useChangeLog) {
            this.useChangeLog = useChangeLog;
            return this;
        }
        public Builder useChangeLog(@Nullable Boolean useChangeLog) {
            this.useChangeLog = Output.ofNullable(useChangeLog);
            return this;
        }
        public Builder vpcConfiguration(@Nullable Output<DataSourceVpcConfigurationArgs> vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }
        public Builder vpcConfiguration(@Nullable DataSourceVpcConfigurationArgs vpcConfiguration) {
            this.vpcConfiguration = Output.ofNullable(vpcConfiguration);
            return this;
        }        public DataSourceSharePointConfigurationArgs build() {
            return new DataSourceSharePointConfigurationArgs(crawlAttachments, disableLocalGroups, documentTitleFieldName, exclusionPatterns, fieldMappings, inclusionPatterns, secretArn, sharePointVersion, sslCertificateS3Path, urls, useChangeLog, vpcConfiguration);
        }
    }
}
