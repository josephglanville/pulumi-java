// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMappingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceWorkDocsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceWorkDocsConfigurationArgs Empty = new DataSourceWorkDocsConfigurationArgs();

    @Import(name="crawlComments")
      private final @Nullable Output<Boolean> crawlComments;

    public Output<Boolean> getCrawlComments() {
        return this.crawlComments == null ? Codegen.empty() : this.crawlComments;
    }

    @Import(name="exclusionPatterns")
      private final @Nullable Output<List<String>> exclusionPatterns;

    public Output<List<String>> getExclusionPatterns() {
        return this.exclusionPatterns == null ? Codegen.empty() : this.exclusionPatterns;
    }

    @Import(name="fieldMappings")
      private final @Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings;

    public Output<List<DataSourceToIndexFieldMappingArgs>> getFieldMappings() {
        return this.fieldMappings == null ? Codegen.empty() : this.fieldMappings;
    }

    @Import(name="inclusionPatterns")
      private final @Nullable Output<List<String>> inclusionPatterns;

    public Output<List<String>> getInclusionPatterns() {
        return this.inclusionPatterns == null ? Codegen.empty() : this.inclusionPatterns;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    @Import(name="useChangeLog")
      private final @Nullable Output<Boolean> useChangeLog;

    public Output<Boolean> getUseChangeLog() {
        return this.useChangeLog == null ? Codegen.empty() : this.useChangeLog;
    }

    public DataSourceWorkDocsConfigurationArgs(
        @Nullable Output<Boolean> crawlComments,
        @Nullable Output<List<String>> exclusionPatterns,
        @Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings,
        @Nullable Output<List<String>> inclusionPatterns,
        Output<String> organizationId,
        @Nullable Output<Boolean> useChangeLog) {
        this.crawlComments = crawlComments;
        this.exclusionPatterns = exclusionPatterns;
        this.fieldMappings = fieldMappings;
        this.inclusionPatterns = inclusionPatterns;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.useChangeLog = useChangeLog;
    }

    private DataSourceWorkDocsConfigurationArgs() {
        this.crawlComments = Codegen.empty();
        this.exclusionPatterns = Codegen.empty();
        this.fieldMappings = Codegen.empty();
        this.inclusionPatterns = Codegen.empty();
        this.organizationId = Codegen.empty();
        this.useChangeLog = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWorkDocsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> crawlComments;
        private @Nullable Output<List<String>> exclusionPatterns;
        private @Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings;
        private @Nullable Output<List<String>> inclusionPatterns;
        private Output<String> organizationId;
        private @Nullable Output<Boolean> useChangeLog;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWorkDocsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlComments = defaults.crawlComments;
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.organizationId = defaults.organizationId;
    	      this.useChangeLog = defaults.useChangeLog;
        }

        public Builder crawlComments(@Nullable Output<Boolean> crawlComments) {
            this.crawlComments = crawlComments;
            return this;
        }
        public Builder crawlComments(@Nullable Boolean crawlComments) {
            this.crawlComments = Codegen.ofNullable(crawlComments);
            return this;
        }
        public Builder exclusionPatterns(@Nullable Output<List<String>> exclusionPatterns) {
            this.exclusionPatterns = exclusionPatterns;
            return this;
        }
        public Builder exclusionPatterns(@Nullable List<String> exclusionPatterns) {
            this.exclusionPatterns = Codegen.ofNullable(exclusionPatterns);
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
            this.fieldMappings = Codegen.ofNullable(fieldMappings);
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
            this.inclusionPatterns = Codegen.ofNullable(inclusionPatterns);
            return this;
        }
        public Builder inclusionPatterns(String... inclusionPatterns) {
            return inclusionPatterns(List.of(inclusionPatterns));
        }
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public Builder useChangeLog(@Nullable Output<Boolean> useChangeLog) {
            this.useChangeLog = useChangeLog;
            return this;
        }
        public Builder useChangeLog(@Nullable Boolean useChangeLog) {
            this.useChangeLog = Codegen.ofNullable(useChangeLog);
            return this;
        }        public DataSourceWorkDocsConfigurationArgs build() {
            return new DataSourceWorkDocsConfigurationArgs(crawlComments, exclusionPatterns, fieldMappings, inclusionPatterns, organizationId, useChangeLog);
        }
    }
}
