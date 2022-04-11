// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttestorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestorArgs Empty = new AttestorArgs();

    /**
     * A Container Analysis ATTESTATION_AUTHORITY Note, created by the user.
     * Structure is documented below.
     * 
     */
    @Import(name="attestationAuthorityNote", required=true)
      private final Output<AttestorAttestationAuthorityNoteArgs> attestationAuthorityNote;

    public Output<AttestorAttestationAuthorityNoteArgs> getAttestationAuthorityNote() {
        return this.attestationAuthorityNote;
    }

    /**
     * A descriptive comment. This field may be updated. The field may be
     * displayed in chooser dialogs.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The resource name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public AttestorArgs(
        Output<AttestorAttestationAuthorityNoteArgs> attestationAuthorityNote,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.attestationAuthorityNote = Objects.requireNonNull(attestationAuthorityNote, "expected parameter 'attestationAuthorityNote' to be non-null");
        this.description = description;
        this.name = name;
        this.project = project;
    }

    private AttestorArgs() {
        this.attestationAuthorityNote = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AttestorAttestationAuthorityNoteArgs> attestationAuthorityNote;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestationAuthorityNote = defaults.attestationAuthorityNote;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder attestationAuthorityNote(Output<AttestorAttestationAuthorityNoteArgs> attestationAuthorityNote) {
            this.attestationAuthorityNote = Objects.requireNonNull(attestationAuthorityNote);
            return this;
        }
        public Builder attestationAuthorityNote(AttestorAttestationAuthorityNoteArgs attestationAuthorityNote) {
            this.attestationAuthorityNote = Output.of(Objects.requireNonNull(attestationAuthorityNote));
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
        }        public AttestorArgs build() {
            return new AttestorArgs(attestationAuthorityNote, description, name, project);
        }
    }
}
