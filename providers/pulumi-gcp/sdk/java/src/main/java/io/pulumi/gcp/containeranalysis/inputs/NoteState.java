// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityGetArgs;
import io.pulumi.gcp.containeranalysis.inputs.NoteRelatedUrlGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NoteState extends io.pulumi.resources.ResourceArgs {

    public static final NoteState Empty = new NoteState();

    /**
     * Note kind that represents a logical attestation "role" or "authority".
     * For example, an organization might have one AttestationAuthority for
     * "QA" and one for "build". This Note is intended to act strictly as a
     * grouping mechanism for the attached Occurrences (Attestations). This
     * grouping mechanism also provides a security boundary, since IAM ACLs
     * gate the ability for a principle to attach an Occurrence to a given
     * Note. It also provides a single point of lookup to find all attached
     * Attestation Occurrences, even if they don't all live in the same
     * project.
     * Structure is documented below.
     * 
     */
    @Import(name="attestationAuthority")
      private final @Nullable Output<NoteAttestationAuthorityGetArgs> attestationAuthority;

    public Output<NoteAttestationAuthorityGetArgs> getAttestationAuthority() {
        return this.attestationAuthority == null ? Output.empty() : this.attestationAuthority;
    }

    /**
     * The time this note was created.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    /**
     * Time of expiration for this note. Leave empty if note does not expire.
     * 
     */
    @Import(name="expirationTime")
      private final @Nullable Output<String> expirationTime;

    public Output<String> getExpirationTime() {
        return this.expirationTime == null ? Output.empty() : this.expirationTime;
    }

    /**
     * The type of analysis this note describes
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * A detailed description of the note
     * 
     */
    @Import(name="longDescription")
      private final @Nullable Output<String> longDescription;

    public Output<String> getLongDescription() {
        return this.longDescription == null ? Output.empty() : this.longDescription;
    }

    /**
     * The name of the note.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Names of other notes related to this note.
     * 
     */
    @Import(name="relatedNoteNames")
      private final @Nullable Output<List<String>> relatedNoteNames;

    public Output<List<String>> getRelatedNoteNames() {
        return this.relatedNoteNames == null ? Output.empty() : this.relatedNoteNames;
    }

    /**
     * URLs associated with this note and related metadata.
     * Structure is documented below.
     * 
     */
    @Import(name="relatedUrls")
      private final @Nullable Output<List<NoteRelatedUrlGetArgs>> relatedUrls;

    public Output<List<NoteRelatedUrlGetArgs>> getRelatedUrls() {
        return this.relatedUrls == null ? Output.empty() : this.relatedUrls;
    }

    /**
     * A one sentence description of the note.
     * 
     */
    @Import(name="shortDescription")
      private final @Nullable Output<String> shortDescription;

    public Output<String> getShortDescription() {
        return this.shortDescription == null ? Output.empty() : this.shortDescription;
    }

    /**
     * The time this note was last updated.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime == null ? Output.empty() : this.updateTime;
    }

    public NoteState(
        @Nullable Output<NoteAttestationAuthorityGetArgs> attestationAuthority,
        @Nullable Output<String> createTime,
        @Nullable Output<String> expirationTime,
        @Nullable Output<String> kind,
        @Nullable Output<String> longDescription,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<List<String>> relatedNoteNames,
        @Nullable Output<List<NoteRelatedUrlGetArgs>> relatedUrls,
        @Nullable Output<String> shortDescription,
        @Nullable Output<String> updateTime) {
        this.attestationAuthority = attestationAuthority;
        this.createTime = createTime;
        this.expirationTime = expirationTime;
        this.kind = kind;
        this.longDescription = longDescription;
        this.name = name;
        this.project = project;
        this.relatedNoteNames = relatedNoteNames;
        this.relatedUrls = relatedUrls;
        this.shortDescription = shortDescription;
        this.updateTime = updateTime;
    }

    private NoteState() {
        this.attestationAuthority = Output.empty();
        this.createTime = Output.empty();
        this.expirationTime = Output.empty();
        this.kind = Output.empty();
        this.longDescription = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.relatedNoteNames = Output.empty();
        this.relatedUrls = Output.empty();
        this.shortDescription = Output.empty();
        this.updateTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NoteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NoteAttestationAuthorityGetArgs> attestationAuthority;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> expirationTime;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> longDescription;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<List<String>> relatedNoteNames;
        private @Nullable Output<List<NoteRelatedUrlGetArgs>> relatedUrls;
        private @Nullable Output<String> shortDescription;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(NoteState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestationAuthority = defaults.attestationAuthority;
    	      this.createTime = defaults.createTime;
    	      this.expirationTime = defaults.expirationTime;
    	      this.kind = defaults.kind;
    	      this.longDescription = defaults.longDescription;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.relatedNoteNames = defaults.relatedNoteNames;
    	      this.relatedUrls = defaults.relatedUrls;
    	      this.shortDescription = defaults.shortDescription;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder attestationAuthority(@Nullable Output<NoteAttestationAuthorityGetArgs> attestationAuthority) {
            this.attestationAuthority = attestationAuthority;
            return this;
        }
        public Builder attestationAuthority(@Nullable NoteAttestationAuthorityGetArgs attestationAuthority) {
            this.attestationAuthority = Output.ofNullable(attestationAuthority);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
            return this;
        }
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Builder expirationTime(@Nullable String expirationTime) {
            this.expirationTime = Output.ofNullable(expirationTime);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder longDescription(@Nullable Output<String> longDescription) {
            this.longDescription = longDescription;
            return this;
        }
        public Builder longDescription(@Nullable String longDescription) {
            this.longDescription = Output.ofNullable(longDescription);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder relatedNoteNames(@Nullable Output<List<String>> relatedNoteNames) {
            this.relatedNoteNames = relatedNoteNames;
            return this;
        }
        public Builder relatedNoteNames(@Nullable List<String> relatedNoteNames) {
            this.relatedNoteNames = Output.ofNullable(relatedNoteNames);
            return this;
        }
        public Builder relatedNoteNames(String... relatedNoteNames) {
            return relatedNoteNames(List.of(relatedNoteNames));
        }
        public Builder relatedUrls(@Nullable Output<List<NoteRelatedUrlGetArgs>> relatedUrls) {
            this.relatedUrls = relatedUrls;
            return this;
        }
        public Builder relatedUrls(@Nullable List<NoteRelatedUrlGetArgs> relatedUrls) {
            this.relatedUrls = Output.ofNullable(relatedUrls);
            return this;
        }
        public Builder relatedUrls(NoteRelatedUrlGetArgs... relatedUrls) {
            return relatedUrls(List.of(relatedUrls));
        }
        public Builder shortDescription(@Nullable Output<String> shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public Builder shortDescription(@Nullable String shortDescription) {
            this.shortDescription = Output.ofNullable(shortDescription);
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Output.ofNullable(updateTime);
            return this;
        }        public NoteState build() {
            return new NoteState(attestationAuthority, createTime, expirationTime, kind, longDescription, name, project, relatedNoteNames, relatedUrls, shortDescription, updateTime);
        }
    }
}
