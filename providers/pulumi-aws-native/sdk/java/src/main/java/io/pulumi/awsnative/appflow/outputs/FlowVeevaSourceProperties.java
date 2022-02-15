// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowVeevaSourceProperties {
    private final @Nullable String documentType;
    private final @Nullable Boolean includeAllVersions;
    private final @Nullable Boolean includeRenditions;
    private final @Nullable Boolean includeSourceFiles;
    private final String object;

    @OutputCustomType.Constructor({"documentType","includeAllVersions","includeRenditions","includeSourceFiles","object"})
    private FlowVeevaSourceProperties(
        @Nullable String documentType,
        @Nullable Boolean includeAllVersions,
        @Nullable Boolean includeRenditions,
        @Nullable Boolean includeSourceFiles,
        String object) {
        this.documentType = documentType;
        this.includeAllVersions = includeAllVersions;
        this.includeRenditions = includeRenditions;
        this.includeSourceFiles = includeSourceFiles;
        this.object = Objects.requireNonNull(object);
    }

    public Optional<String> getDocumentType() {
        return Optional.ofNullable(this.documentType);
    }
    public Optional<Boolean> getIncludeAllVersions() {
        return Optional.ofNullable(this.includeAllVersions);
    }
    public Optional<Boolean> getIncludeRenditions() {
        return Optional.ofNullable(this.includeRenditions);
    }
    public Optional<Boolean> getIncludeSourceFiles() {
        return Optional.ofNullable(this.includeSourceFiles);
    }
    public String getObject() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowVeevaSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String documentType;
        private @Nullable Boolean includeAllVersions;
        private @Nullable Boolean includeRenditions;
        private @Nullable Boolean includeSourceFiles;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowVeevaSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentType = defaults.documentType;
    	      this.includeAllVersions = defaults.includeAllVersions;
    	      this.includeRenditions = defaults.includeRenditions;
    	      this.includeSourceFiles = defaults.includeSourceFiles;
    	      this.object = defaults.object;
        }

        public Builder setDocumentType(@Nullable String documentType) {
            this.documentType = documentType;
            return this;
        }

        public Builder setIncludeAllVersions(@Nullable Boolean includeAllVersions) {
            this.includeAllVersions = includeAllVersions;
            return this;
        }

        public Builder setIncludeRenditions(@Nullable Boolean includeRenditions) {
            this.includeRenditions = includeRenditions;
            return this;
        }

        public Builder setIncludeSourceFiles(@Nullable Boolean includeSourceFiles) {
            this.includeSourceFiles = includeSourceFiles;
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public FlowVeevaSourceProperties build() {
            return new FlowVeevaSourceProperties(documentType, includeAllVersions, includeRenditions, includeSourceFiles, object);
        }
    }
}