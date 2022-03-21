// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.AuthorityArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.BasisArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.BuildArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.DeployableArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.DiscoveryArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.DocumentNoteArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.FileNoteArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.InTotoArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.PackageArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.PackageInfoNoteArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.RelatedUrlArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.RelationshipNoteArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.VulnerabilityArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final NoteArgs Empty = new NoteArgs();

    /**
     * A note describing an attestation role.
     * 
     */
    @Import(name="attestationAuthority")
      private final @Nullable Output<AuthorityArgs> attestationAuthority;

    public Output<AuthorityArgs> getAttestationAuthority() {
        return this.attestationAuthority == null ? Output.empty() : this.attestationAuthority;
    }

    /**
     * A note describing a base image.
     * 
     */
    @Import(name="baseImage")
      private final @Nullable Output<BasisArgs> baseImage;

    public Output<BasisArgs> getBaseImage() {
        return this.baseImage == null ? Output.empty() : this.baseImage;
    }

    /**
     * A note describing build provenance for a verifiable build.
     * 
     */
    @Import(name="build")
      private final @Nullable Output<BuildArgs> build;

    public Output<BuildArgs> getBuild() {
        return this.build == null ? Output.empty() : this.build;
    }

    /**
     * A note describing something that can be deployed.
     * 
     */
    @Import(name="deployable")
      private final @Nullable Output<DeployableArgs> deployable;

    public Output<DeployableArgs> getDeployable() {
        return this.deployable == null ? Output.empty() : this.deployable;
    }

    /**
     * A note describing the initial analysis of a resource.
     * 
     */
    @Import(name="discovery")
      private final @Nullable Output<DiscoveryArgs> discovery;

    public Output<DiscoveryArgs> getDiscovery() {
        return this.discovery == null ? Output.empty() : this.discovery;
    }

    /**
     * Time of expiration for this note. Empty if note does not expire.
     * 
     */
    @Import(name="expirationTime")
      private final @Nullable Output<String> expirationTime;

    public Output<String> getExpirationTime() {
        return this.expirationTime == null ? Output.empty() : this.expirationTime;
    }

    /**
     * A note describing an in-toto link.
     * 
     */
    @Import(name="intoto")
      private final @Nullable Output<InTotoArgs> intoto;

    public Output<InTotoArgs> getIntoto() {
        return this.intoto == null ? Output.empty() : this.intoto;
    }

    /**
     * A detailed description of this note.
     * 
     */
    @Import(name="longDescription")
      private final @Nullable Output<String> longDescription;

    public Output<String> getLongDescription() {
        return this.longDescription == null ? Output.empty() : this.longDescription;
    }

    @Import(name="noteId", required=true)
      private final Output<String> noteId;

    public Output<String> getNoteId() {
        return this.noteId;
    }

    /**
     * A note describing a package hosted by various package managers.
     * 
     */
    @Import(name="package")
      private final @Nullable Output<PackageArgs> $package;

    public Output<PackageArgs> get$package() {
        return this.$package == null ? Output.empty() : this.$package;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Other notes related to this note.
     * 
     */
    @Import(name="relatedNoteNames")
      private final @Nullable Output<List<String>> relatedNoteNames;

    public Output<List<String>> getRelatedNoteNames() {
        return this.relatedNoteNames == null ? Output.empty() : this.relatedNoteNames;
    }

    /**
     * URLs associated with this note.
     * 
     */
    @Import(name="relatedUrl")
      private final @Nullable Output<List<RelatedUrlArgs>> relatedUrl;

    public Output<List<RelatedUrlArgs>> getRelatedUrl() {
        return this.relatedUrl == null ? Output.empty() : this.relatedUrl;
    }

    /**
     * A note describing a software bill of materials.
     * 
     */
    @Import(name="sbom")
      private final @Nullable Output<DocumentNoteArgs> sbom;

    public Output<DocumentNoteArgs> getSbom() {
        return this.sbom == null ? Output.empty() : this.sbom;
    }

    /**
     * A one sentence description of this note.
     * 
     */
    @Import(name="shortDescription")
      private final @Nullable Output<String> shortDescription;

    public Output<String> getShortDescription() {
        return this.shortDescription == null ? Output.empty() : this.shortDescription;
    }

    /**
     * A note describing an SPDX File.
     * 
     */
    @Import(name="spdxFile")
      private final @Nullable Output<FileNoteArgs> spdxFile;

    public Output<FileNoteArgs> getSpdxFile() {
        return this.spdxFile == null ? Output.empty() : this.spdxFile;
    }

    /**
     * A note describing an SPDX Package.
     * 
     */
    @Import(name="spdxPackage")
      private final @Nullable Output<PackageInfoNoteArgs> spdxPackage;

    public Output<PackageInfoNoteArgs> getSpdxPackage() {
        return this.spdxPackage == null ? Output.empty() : this.spdxPackage;
    }

    /**
     * A note describing an SPDX File.
     * 
     */
    @Import(name="spdxRelationship")
      private final @Nullable Output<RelationshipNoteArgs> spdxRelationship;

    public Output<RelationshipNoteArgs> getSpdxRelationship() {
        return this.spdxRelationship == null ? Output.empty() : this.spdxRelationship;
    }

    /**
     * A note describing a package vulnerability.
     * 
     */
    @Import(name="vulnerability")
      private final @Nullable Output<VulnerabilityArgs> vulnerability;

    public Output<VulnerabilityArgs> getVulnerability() {
        return this.vulnerability == null ? Output.empty() : this.vulnerability;
    }

    public NoteArgs(
        @Nullable Output<AuthorityArgs> attestationAuthority,
        @Nullable Output<BasisArgs> baseImage,
        @Nullable Output<BuildArgs> build,
        @Nullable Output<DeployableArgs> deployable,
        @Nullable Output<DiscoveryArgs> discovery,
        @Nullable Output<String> expirationTime,
        @Nullable Output<InTotoArgs> intoto,
        @Nullable Output<String> longDescription,
        Output<String> noteId,
        @Nullable Output<PackageArgs> $package,
        @Nullable Output<String> project,
        @Nullable Output<List<String>> relatedNoteNames,
        @Nullable Output<List<RelatedUrlArgs>> relatedUrl,
        @Nullable Output<DocumentNoteArgs> sbom,
        @Nullable Output<String> shortDescription,
        @Nullable Output<FileNoteArgs> spdxFile,
        @Nullable Output<PackageInfoNoteArgs> spdxPackage,
        @Nullable Output<RelationshipNoteArgs> spdxRelationship,
        @Nullable Output<VulnerabilityArgs> vulnerability) {
        this.attestationAuthority = attestationAuthority;
        this.baseImage = baseImage;
        this.build = build;
        this.deployable = deployable;
        this.discovery = discovery;
        this.expirationTime = expirationTime;
        this.intoto = intoto;
        this.longDescription = longDescription;
        this.noteId = Objects.requireNonNull(noteId, "expected parameter 'noteId' to be non-null");
        this.$package = $package;
        this.project = project;
        this.relatedNoteNames = relatedNoteNames;
        this.relatedUrl = relatedUrl;
        this.sbom = sbom;
        this.shortDescription = shortDescription;
        this.spdxFile = spdxFile;
        this.spdxPackage = spdxPackage;
        this.spdxRelationship = spdxRelationship;
        this.vulnerability = vulnerability;
    }

    private NoteArgs() {
        this.attestationAuthority = Output.empty();
        this.baseImage = Output.empty();
        this.build = Output.empty();
        this.deployable = Output.empty();
        this.discovery = Output.empty();
        this.expirationTime = Output.empty();
        this.intoto = Output.empty();
        this.longDescription = Output.empty();
        this.noteId = Output.empty();
        this.$package = Output.empty();
        this.project = Output.empty();
        this.relatedNoteNames = Output.empty();
        this.relatedUrl = Output.empty();
        this.sbom = Output.empty();
        this.shortDescription = Output.empty();
        this.spdxFile = Output.empty();
        this.spdxPackage = Output.empty();
        this.spdxRelationship = Output.empty();
        this.vulnerability = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AuthorityArgs> attestationAuthority;
        private @Nullable Output<BasisArgs> baseImage;
        private @Nullable Output<BuildArgs> build;
        private @Nullable Output<DeployableArgs> deployable;
        private @Nullable Output<DiscoveryArgs> discovery;
        private @Nullable Output<String> expirationTime;
        private @Nullable Output<InTotoArgs> intoto;
        private @Nullable Output<String> longDescription;
        private Output<String> noteId;
        private @Nullable Output<PackageArgs> $package;
        private @Nullable Output<String> project;
        private @Nullable Output<List<String>> relatedNoteNames;
        private @Nullable Output<List<RelatedUrlArgs>> relatedUrl;
        private @Nullable Output<DocumentNoteArgs> sbom;
        private @Nullable Output<String> shortDescription;
        private @Nullable Output<FileNoteArgs> spdxFile;
        private @Nullable Output<PackageInfoNoteArgs> spdxPackage;
        private @Nullable Output<RelationshipNoteArgs> spdxRelationship;
        private @Nullable Output<VulnerabilityArgs> vulnerability;

        public Builder() {
    	      // Empty
        }

        public Builder(NoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestationAuthority = defaults.attestationAuthority;
    	      this.baseImage = defaults.baseImage;
    	      this.build = defaults.build;
    	      this.deployable = defaults.deployable;
    	      this.discovery = defaults.discovery;
    	      this.expirationTime = defaults.expirationTime;
    	      this.intoto = defaults.intoto;
    	      this.longDescription = defaults.longDescription;
    	      this.noteId = defaults.noteId;
    	      this.$package = defaults.$package;
    	      this.project = defaults.project;
    	      this.relatedNoteNames = defaults.relatedNoteNames;
    	      this.relatedUrl = defaults.relatedUrl;
    	      this.sbom = defaults.sbom;
    	      this.shortDescription = defaults.shortDescription;
    	      this.spdxFile = defaults.spdxFile;
    	      this.spdxPackage = defaults.spdxPackage;
    	      this.spdxRelationship = defaults.spdxRelationship;
    	      this.vulnerability = defaults.vulnerability;
        }

        public Builder attestationAuthority(@Nullable Output<AuthorityArgs> attestationAuthority) {
            this.attestationAuthority = attestationAuthority;
            return this;
        }
        public Builder attestationAuthority(@Nullable AuthorityArgs attestationAuthority) {
            this.attestationAuthority = Output.ofNullable(attestationAuthority);
            return this;
        }
        public Builder baseImage(@Nullable Output<BasisArgs> baseImage) {
            this.baseImage = baseImage;
            return this;
        }
        public Builder baseImage(@Nullable BasisArgs baseImage) {
            this.baseImage = Output.ofNullable(baseImage);
            return this;
        }
        public Builder build(@Nullable Output<BuildArgs> build) {
            this.build = build;
            return this;
        }
        public Builder build(@Nullable BuildArgs build) {
            this.build = Output.ofNullable(build);
            return this;
        }
        public Builder deployable(@Nullable Output<DeployableArgs> deployable) {
            this.deployable = deployable;
            return this;
        }
        public Builder deployable(@Nullable DeployableArgs deployable) {
            this.deployable = Output.ofNullable(deployable);
            return this;
        }
        public Builder discovery(@Nullable Output<DiscoveryArgs> discovery) {
            this.discovery = discovery;
            return this;
        }
        public Builder discovery(@Nullable DiscoveryArgs discovery) {
            this.discovery = Output.ofNullable(discovery);
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
        public Builder intoto(@Nullable Output<InTotoArgs> intoto) {
            this.intoto = intoto;
            return this;
        }
        public Builder intoto(@Nullable InTotoArgs intoto) {
            this.intoto = Output.ofNullable(intoto);
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
        public Builder noteId(Output<String> noteId) {
            this.noteId = Objects.requireNonNull(noteId);
            return this;
        }
        public Builder noteId(String noteId) {
            this.noteId = Output.of(Objects.requireNonNull(noteId));
            return this;
        }
        public Builder $package(@Nullable Output<PackageArgs> $package) {
            this.$package = $package;
            return this;
        }
        public Builder $package(@Nullable PackageArgs $package) {
            this.$package = Output.ofNullable($package);
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
        public Builder relatedUrl(@Nullable Output<List<RelatedUrlArgs>> relatedUrl) {
            this.relatedUrl = relatedUrl;
            return this;
        }
        public Builder relatedUrl(@Nullable List<RelatedUrlArgs> relatedUrl) {
            this.relatedUrl = Output.ofNullable(relatedUrl);
            return this;
        }
        public Builder relatedUrl(RelatedUrlArgs... relatedUrl) {
            return relatedUrl(List.of(relatedUrl));
        }
        public Builder sbom(@Nullable Output<DocumentNoteArgs> sbom) {
            this.sbom = sbom;
            return this;
        }
        public Builder sbom(@Nullable DocumentNoteArgs sbom) {
            this.sbom = Output.ofNullable(sbom);
            return this;
        }
        public Builder shortDescription(@Nullable Output<String> shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public Builder shortDescription(@Nullable String shortDescription) {
            this.shortDescription = Output.ofNullable(shortDescription);
            return this;
        }
        public Builder spdxFile(@Nullable Output<FileNoteArgs> spdxFile) {
            this.spdxFile = spdxFile;
            return this;
        }
        public Builder spdxFile(@Nullable FileNoteArgs spdxFile) {
            this.spdxFile = Output.ofNullable(spdxFile);
            return this;
        }
        public Builder spdxPackage(@Nullable Output<PackageInfoNoteArgs> spdxPackage) {
            this.spdxPackage = spdxPackage;
            return this;
        }
        public Builder spdxPackage(@Nullable PackageInfoNoteArgs spdxPackage) {
            this.spdxPackage = Output.ofNullable(spdxPackage);
            return this;
        }
        public Builder spdxRelationship(@Nullable Output<RelationshipNoteArgs> spdxRelationship) {
            this.spdxRelationship = spdxRelationship;
            return this;
        }
        public Builder spdxRelationship(@Nullable RelationshipNoteArgs spdxRelationship) {
            this.spdxRelationship = Output.ofNullable(spdxRelationship);
            return this;
        }
        public Builder vulnerability(@Nullable Output<VulnerabilityArgs> vulnerability) {
            this.vulnerability = vulnerability;
            return this;
        }
        public Builder vulnerability(@Nullable VulnerabilityArgs vulnerability) {
            this.vulnerability = Output.ofNullable(vulnerability);
            return this;
        }        public NoteArgs build() {
            return new NoteArgs(attestationAuthority, baseImage, build, deployable, discovery, expirationTime, intoto, longDescription, noteId, $package, project, relatedNoteNames, relatedUrl, sbom, shortDescription, spdxFile, spdxPackage, spdxRelationship, vulnerability);
        }
    }
}
