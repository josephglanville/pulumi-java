// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.binaryauthorization_v1beta1.inputs.UserOwnedDrydockNoteArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttestorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestorArgs Empty = new AttestorArgs();

    @Import(name="attestorId", required=true)
      private final Output<String> attestorId;

    public Output<String> getAttestorId() {
        return this.attestorId;
    }

    /**
     * Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The resource name, in the format: `projects/*{@literal /}attestors/*`. This field may not be updated.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * A Drydock ATTESTATION_AUTHORITY Note, created by the user.
     * 
     */
    @Import(name="userOwnedDrydockNote")
      private final @Nullable Output<UserOwnedDrydockNoteArgs> userOwnedDrydockNote;

    public Output<UserOwnedDrydockNoteArgs> getUserOwnedDrydockNote() {
        return this.userOwnedDrydockNote == null ? Codegen.empty() : this.userOwnedDrydockNote;
    }

    public AttestorArgs(
        Output<String> attestorId,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<UserOwnedDrydockNoteArgs> userOwnedDrydockNote) {
        this.attestorId = Objects.requireNonNull(attestorId, "expected parameter 'attestorId' to be non-null");
        this.description = description;
        this.name = name;
        this.project = project;
        this.userOwnedDrydockNote = userOwnedDrydockNote;
    }

    private AttestorArgs() {
        this.attestorId = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.userOwnedDrydockNote = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> attestorId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<UserOwnedDrydockNoteArgs> userOwnedDrydockNote;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestorId = defaults.attestorId;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.userOwnedDrydockNote = defaults.userOwnedDrydockNote;
        }

        public Builder attestorId(Output<String> attestorId) {
            this.attestorId = Objects.requireNonNull(attestorId);
            return this;
        }
        public Builder attestorId(String attestorId) {
            this.attestorId = Output.of(Objects.requireNonNull(attestorId));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder userOwnedDrydockNote(@Nullable Output<UserOwnedDrydockNoteArgs> userOwnedDrydockNote) {
            this.userOwnedDrydockNote = userOwnedDrydockNote;
            return this;
        }
        public Builder userOwnedDrydockNote(@Nullable UserOwnedDrydockNoteArgs userOwnedDrydockNote) {
            this.userOwnedDrydockNote = Codegen.ofNullable(userOwnedDrydockNote);
            return this;
        }        public AttestorArgs build() {
            return new AttestorArgs(attestorId, description, name, project, userOwnedDrydockNote);
        }
    }
}
