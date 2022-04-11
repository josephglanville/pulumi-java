// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowVeevaSourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowVeevaSourcePropertiesArgs Empty = new FlowVeevaSourcePropertiesArgs();

    @Import(name="documentType")
      private final @Nullable Output<String> documentType;

    public Output<String> getDocumentType() {
        return this.documentType == null ? Codegen.empty() : this.documentType;
    }

    @Import(name="includeAllVersions")
      private final @Nullable Output<Boolean> includeAllVersions;

    public Output<Boolean> getIncludeAllVersions() {
        return this.includeAllVersions == null ? Codegen.empty() : this.includeAllVersions;
    }

    @Import(name="includeRenditions")
      private final @Nullable Output<Boolean> includeRenditions;

    public Output<Boolean> getIncludeRenditions() {
        return this.includeRenditions == null ? Codegen.empty() : this.includeRenditions;
    }

    @Import(name="includeSourceFiles")
      private final @Nullable Output<Boolean> includeSourceFiles;

    public Output<Boolean> getIncludeSourceFiles() {
        return this.includeSourceFiles == null ? Codegen.empty() : this.includeSourceFiles;
    }

    @Import(name="object", required=true)
      private final Output<String> object;

    public Output<String> getObject() {
        return this.object;
    }

    public FlowVeevaSourcePropertiesArgs(
        @Nullable Output<String> documentType,
        @Nullable Output<Boolean> includeAllVersions,
        @Nullable Output<Boolean> includeRenditions,
        @Nullable Output<Boolean> includeSourceFiles,
        Output<String> object) {
        this.documentType = documentType;
        this.includeAllVersions = includeAllVersions;
        this.includeRenditions = includeRenditions;
        this.includeSourceFiles = includeSourceFiles;
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowVeevaSourcePropertiesArgs() {
        this.documentType = Codegen.empty();
        this.includeAllVersions = Codegen.empty();
        this.includeRenditions = Codegen.empty();
        this.includeSourceFiles = Codegen.empty();
        this.object = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowVeevaSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> documentType;
        private @Nullable Output<Boolean> includeAllVersions;
        private @Nullable Output<Boolean> includeRenditions;
        private @Nullable Output<Boolean> includeSourceFiles;
        private Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowVeevaSourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentType = defaults.documentType;
    	      this.includeAllVersions = defaults.includeAllVersions;
    	      this.includeRenditions = defaults.includeRenditions;
    	      this.includeSourceFiles = defaults.includeSourceFiles;
    	      this.object = defaults.object;
        }

        public Builder documentType(@Nullable Output<String> documentType) {
            this.documentType = documentType;
            return this;
        }
        public Builder documentType(@Nullable String documentType) {
            this.documentType = Codegen.ofNullable(documentType);
            return this;
        }
        public Builder includeAllVersions(@Nullable Output<Boolean> includeAllVersions) {
            this.includeAllVersions = includeAllVersions;
            return this;
        }
        public Builder includeAllVersions(@Nullable Boolean includeAllVersions) {
            this.includeAllVersions = Codegen.ofNullable(includeAllVersions);
            return this;
        }
        public Builder includeRenditions(@Nullable Output<Boolean> includeRenditions) {
            this.includeRenditions = includeRenditions;
            return this;
        }
        public Builder includeRenditions(@Nullable Boolean includeRenditions) {
            this.includeRenditions = Codegen.ofNullable(includeRenditions);
            return this;
        }
        public Builder includeSourceFiles(@Nullable Output<Boolean> includeSourceFiles) {
            this.includeSourceFiles = includeSourceFiles;
            return this;
        }
        public Builder includeSourceFiles(@Nullable Boolean includeSourceFiles) {
            this.includeSourceFiles = Codegen.ofNullable(includeSourceFiles);
            return this;
        }
        public Builder object(Output<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder object(String object) {
            this.object = Output.of(Objects.requireNonNull(object));
            return this;
        }        public FlowVeevaSourcePropertiesArgs build() {
            return new FlowVeevaSourcePropertiesArgs(documentType, includeAllVersions, includeRenditions, includeSourceFiles, object);
        }
    }
}
