// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNoteIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNoteIamPolicyArgs Empty = new GetNoteIamPolicyArgs();

    @Import(name="noteId", required=true)
      private final String noteId;

    public String getNoteId() {
        return this.noteId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetNoteIamPolicyArgs(
        String noteId,
        @Nullable String project) {
        this.noteId = Objects.requireNonNull(noteId, "expected parameter 'noteId' to be non-null");
        this.project = project;
    }

    private GetNoteIamPolicyArgs() {
        this.noteId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNoteIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String noteId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNoteIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.noteId = defaults.noteId;
    	      this.project = defaults.project;
        }

        public Builder noteId(String noteId) {
            this.noteId = Objects.requireNonNull(noteId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetNoteIamPolicyArgs build() {
            return new GetNoteIamPolicyArgs(noteId, project);
        }
    }
}
