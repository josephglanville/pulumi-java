// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.ContentLinkResponse;
import io.pulumi.azurenative.automation.outputs.RunbookParameterResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RunbookDraftResponse {
    private final @Nullable String creationTime;
    private final @Nullable ContentLinkResponse draftContentLink;
    private final @Nullable Boolean inEdit;
    private final @Nullable String lastModifiedTime;
    private final @Nullable List<String> outputTypes;
    private final @Nullable Map<String,RunbookParameterResponse> parameters;

    @OutputCustomType.Constructor({"creationTime","draftContentLink","inEdit","lastModifiedTime","outputTypes","parameters"})
    private RunbookDraftResponse(
        @Nullable String creationTime,
        @Nullable ContentLinkResponse draftContentLink,
        @Nullable Boolean inEdit,
        @Nullable String lastModifiedTime,
        @Nullable List<String> outputTypes,
        @Nullable Map<String,RunbookParameterResponse> parameters) {
        this.creationTime = creationTime;
        this.draftContentLink = draftContentLink;
        this.inEdit = inEdit;
        this.lastModifiedTime = lastModifiedTime;
        this.outputTypes = outputTypes;
        this.parameters = parameters;
    }

    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    public Optional<ContentLinkResponse> getDraftContentLink() {
        return Optional.ofNullable(this.draftContentLink);
    }
    public Optional<Boolean> getInEdit() {
        return Optional.ofNullable(this.inEdit);
    }
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    public List<String> getOutputTypes() {
        return this.outputTypes == null ? List.of() : this.outputTypes;
    }
    public Map<String,RunbookParameterResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunbookDraftResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable ContentLinkResponse draftContentLink;
        private @Nullable Boolean inEdit;
        private @Nullable String lastModifiedTime;
        private @Nullable List<String> outputTypes;
        private @Nullable Map<String,RunbookParameterResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(RunbookDraftResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.draftContentLink = defaults.draftContentLink;
    	      this.inEdit = defaults.inEdit;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.outputTypes = defaults.outputTypes;
    	      this.parameters = defaults.parameters;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setDraftContentLink(@Nullable ContentLinkResponse draftContentLink) {
            this.draftContentLink = draftContentLink;
            return this;
        }

        public Builder setInEdit(@Nullable Boolean inEdit) {
            this.inEdit = inEdit;
            return this;
        }

        public Builder setLastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder setOutputTypes(@Nullable List<String> outputTypes) {
            this.outputTypes = outputTypes;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,RunbookParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public RunbookDraftResponse build() {
            return new RunbookDraftResponse(creationTime, draftContentLink, inEdit, lastModifiedTime, outputTypes, parameters);
        }
    }
}
