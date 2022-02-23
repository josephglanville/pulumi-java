// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="attestationAuthorityNote", required=true)
      private final Input<AttestorAttestationAuthorityNoteArgs> attestationAuthorityNote;

    public Input<AttestorAttestationAuthorityNoteArgs> getAttestationAuthorityNote() {
        return this.attestationAuthorityNote;
    }

    /**
     * A descriptive comment. This field may be updated. The field may be
     * displayed in chooser dialogs.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The resource name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public AttestorArgs(
        Input<AttestorAttestationAuthorityNoteArgs> attestationAuthorityNote,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.attestationAuthorityNote = Objects.requireNonNull(attestationAuthorityNote, "expected parameter 'attestationAuthorityNote' to be non-null");
        this.description = description;
        this.name = name;
        this.project = project;
    }

    private AttestorArgs() {
        this.attestationAuthorityNote = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AttestorAttestationAuthorityNoteArgs> attestationAuthorityNote;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

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

        public Builder setAttestationAuthorityNote(Input<AttestorAttestationAuthorityNoteArgs> attestationAuthorityNote) {
            this.attestationAuthorityNote = Objects.requireNonNull(attestationAuthorityNote);
            return this;
        }

        public Builder setAttestationAuthorityNote(AttestorAttestationAuthorityNoteArgs attestationAuthorityNote) {
            this.attestationAuthorityNote = Input.of(Objects.requireNonNull(attestationAuthorityNote));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public AttestorArgs build() {
            return new AttestorArgs(attestationAuthorityNote, description, name, project);
        }
    }
}
