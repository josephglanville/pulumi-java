// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.AttestationResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.BuildDetailsResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.ComplianceOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DSSEAttestationOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DeploymentResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DerivedResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DiscoveredResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DocumentOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.EnvelopeResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.FileOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.InstallationResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.PackageInfoOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.RelationshipOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.ResourceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.UpgradeOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.VulnerabilityDetailsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetOccurrenceResult {
    private final AttestationResponse attestation;
    private final BuildDetailsResponse buildDetails;
    private final ComplianceOccurrenceResponse compliance;
    private final String createTime;
    private final DeploymentResponse deployment;
    private final DerivedResponse derivedImage;
    private final DiscoveredResponse discovered;
    private final DSSEAttestationOccurrenceResponse dsseAttestation;
    private final EnvelopeResponse envelope;
    private final InstallationResponse installation;
    private final String kind;
    private final String name;
    private final String noteName;
    private final String remediation;
    private final ResourceResponse resource;
    private final String resourceUrl;
    private final DocumentOccurrenceResponse sbom;
    private final FileOccurrenceResponse spdxFile;
    private final PackageInfoOccurrenceResponse spdxPackage;
    private final RelationshipOccurrenceResponse spdxRelationship;
    private final String updateTime;
    private final UpgradeOccurrenceResponse upgrade;
    private final VulnerabilityDetailsResponse vulnerabilityDetails;

    @OutputCustomType.Constructor({"attestation","buildDetails","compliance","createTime","deployment","derivedImage","discovered","dsseAttestation","envelope","installation","kind","name","noteName","remediation","resource","resourceUrl","sbom","spdxFile","spdxPackage","spdxRelationship","updateTime","upgrade","vulnerabilityDetails"})
    private GetOccurrenceResult(
        AttestationResponse attestation,
        BuildDetailsResponse buildDetails,
        ComplianceOccurrenceResponse compliance,
        String createTime,
        DeploymentResponse deployment,
        DerivedResponse derivedImage,
        DiscoveredResponse discovered,
        DSSEAttestationOccurrenceResponse dsseAttestation,
        EnvelopeResponse envelope,
        InstallationResponse installation,
        String kind,
        String name,
        String noteName,
        String remediation,
        ResourceResponse resource,
        String resourceUrl,
        DocumentOccurrenceResponse sbom,
        FileOccurrenceResponse spdxFile,
        PackageInfoOccurrenceResponse spdxPackage,
        RelationshipOccurrenceResponse spdxRelationship,
        String updateTime,
        UpgradeOccurrenceResponse upgrade,
        VulnerabilityDetailsResponse vulnerabilityDetails) {
        this.attestation = Objects.requireNonNull(attestation);
        this.buildDetails = Objects.requireNonNull(buildDetails);
        this.compliance = Objects.requireNonNull(compliance);
        this.createTime = Objects.requireNonNull(createTime);
        this.deployment = Objects.requireNonNull(deployment);
        this.derivedImage = Objects.requireNonNull(derivedImage);
        this.discovered = Objects.requireNonNull(discovered);
        this.dsseAttestation = Objects.requireNonNull(dsseAttestation);
        this.envelope = Objects.requireNonNull(envelope);
        this.installation = Objects.requireNonNull(installation);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.noteName = Objects.requireNonNull(noteName);
        this.remediation = Objects.requireNonNull(remediation);
        this.resource = Objects.requireNonNull(resource);
        this.resourceUrl = Objects.requireNonNull(resourceUrl);
        this.sbom = Objects.requireNonNull(sbom);
        this.spdxFile = Objects.requireNonNull(spdxFile);
        this.spdxPackage = Objects.requireNonNull(spdxPackage);
        this.spdxRelationship = Objects.requireNonNull(spdxRelationship);
        this.updateTime = Objects.requireNonNull(updateTime);
        this.upgrade = Objects.requireNonNull(upgrade);
        this.vulnerabilityDetails = Objects.requireNonNull(vulnerabilityDetails);
    }

    public AttestationResponse getAttestation() {
        return this.attestation;
    }
    public BuildDetailsResponse getBuildDetails() {
        return this.buildDetails;
    }
    public ComplianceOccurrenceResponse getCompliance() {
        return this.compliance;
    }
    public String getCreateTime() {
        return this.createTime;
    }
    public DeploymentResponse getDeployment() {
        return this.deployment;
    }
    public DerivedResponse getDerivedImage() {
        return this.derivedImage;
    }
    public DiscoveredResponse getDiscovered() {
        return this.discovered;
    }
    public DSSEAttestationOccurrenceResponse getDsseAttestation() {
        return this.dsseAttestation;
    }
    public EnvelopeResponse getEnvelope() {
        return this.envelope;
    }
    public InstallationResponse getInstallation() {
        return this.installation;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public String getNoteName() {
        return this.noteName;
    }
    public String getRemediation() {
        return this.remediation;
    }
    public ResourceResponse getResource() {
        return this.resource;
    }
    public String getResourceUrl() {
        return this.resourceUrl;
    }
    public DocumentOccurrenceResponse getSbom() {
        return this.sbom;
    }
    public FileOccurrenceResponse getSpdxFile() {
        return this.spdxFile;
    }
    public PackageInfoOccurrenceResponse getSpdxPackage() {
        return this.spdxPackage;
    }
    public RelationshipOccurrenceResponse getSpdxRelationship() {
        return this.spdxRelationship;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }
    public UpgradeOccurrenceResponse getUpgrade() {
        return this.upgrade;
    }
    public VulnerabilityDetailsResponse getVulnerabilityDetails() {
        return this.vulnerabilityDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOccurrenceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationResponse attestation;
        private BuildDetailsResponse buildDetails;
        private ComplianceOccurrenceResponse compliance;
        private String createTime;
        private DeploymentResponse deployment;
        private DerivedResponse derivedImage;
        private DiscoveredResponse discovered;
        private DSSEAttestationOccurrenceResponse dsseAttestation;
        private EnvelopeResponse envelope;
        private InstallationResponse installation;
        private String kind;
        private String name;
        private String noteName;
        private String remediation;
        private ResourceResponse resource;
        private String resourceUrl;
        private DocumentOccurrenceResponse sbom;
        private FileOccurrenceResponse spdxFile;
        private PackageInfoOccurrenceResponse spdxPackage;
        private RelationshipOccurrenceResponse spdxRelationship;
        private String updateTime;
        private UpgradeOccurrenceResponse upgrade;
        private VulnerabilityDetailsResponse vulnerabilityDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOccurrenceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.buildDetails = defaults.buildDetails;
    	      this.compliance = defaults.compliance;
    	      this.createTime = defaults.createTime;
    	      this.deployment = defaults.deployment;
    	      this.derivedImage = defaults.derivedImage;
    	      this.discovered = defaults.discovered;
    	      this.dsseAttestation = defaults.dsseAttestation;
    	      this.envelope = defaults.envelope;
    	      this.installation = defaults.installation;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.noteName = defaults.noteName;
    	      this.remediation = defaults.remediation;
    	      this.resource = defaults.resource;
    	      this.resourceUrl = defaults.resourceUrl;
    	      this.sbom = defaults.sbom;
    	      this.spdxFile = defaults.spdxFile;
    	      this.spdxPackage = defaults.spdxPackage;
    	      this.spdxRelationship = defaults.spdxRelationship;
    	      this.updateTime = defaults.updateTime;
    	      this.upgrade = defaults.upgrade;
    	      this.vulnerabilityDetails = defaults.vulnerabilityDetails;
        }

        public Builder setAttestation(AttestationResponse attestation) {
            this.attestation = Objects.requireNonNull(attestation);
            return this;
        }

        public Builder setBuildDetails(BuildDetailsResponse buildDetails) {
            this.buildDetails = Objects.requireNonNull(buildDetails);
            return this;
        }

        public Builder setCompliance(ComplianceOccurrenceResponse compliance) {
            this.compliance = Objects.requireNonNull(compliance);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDeployment(DeploymentResponse deployment) {
            this.deployment = Objects.requireNonNull(deployment);
            return this;
        }

        public Builder setDerivedImage(DerivedResponse derivedImage) {
            this.derivedImage = Objects.requireNonNull(derivedImage);
            return this;
        }

        public Builder setDiscovered(DiscoveredResponse discovered) {
            this.discovered = Objects.requireNonNull(discovered);
            return this;
        }

        public Builder setDsseAttestation(DSSEAttestationOccurrenceResponse dsseAttestation) {
            this.dsseAttestation = Objects.requireNonNull(dsseAttestation);
            return this;
        }

        public Builder setEnvelope(EnvelopeResponse envelope) {
            this.envelope = Objects.requireNonNull(envelope);
            return this;
        }

        public Builder setInstallation(InstallationResponse installation) {
            this.installation = Objects.requireNonNull(installation);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNoteName(String noteName) {
            this.noteName = Objects.requireNonNull(noteName);
            return this;
        }

        public Builder setRemediation(String remediation) {
            this.remediation = Objects.requireNonNull(remediation);
            return this;
        }

        public Builder setResource(ResourceResponse resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder setResourceUrl(String resourceUrl) {
            this.resourceUrl = Objects.requireNonNull(resourceUrl);
            return this;
        }

        public Builder setSbom(DocumentOccurrenceResponse sbom) {
            this.sbom = Objects.requireNonNull(sbom);
            return this;
        }

        public Builder setSpdxFile(FileOccurrenceResponse spdxFile) {
            this.spdxFile = Objects.requireNonNull(spdxFile);
            return this;
        }

        public Builder setSpdxPackage(PackageInfoOccurrenceResponse spdxPackage) {
            this.spdxPackage = Objects.requireNonNull(spdxPackage);
            return this;
        }

        public Builder setSpdxRelationship(RelationshipOccurrenceResponse spdxRelationship) {
            this.spdxRelationship = Objects.requireNonNull(spdxRelationship);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setUpgrade(UpgradeOccurrenceResponse upgrade) {
            this.upgrade = Objects.requireNonNull(upgrade);
            return this;
        }

        public Builder setVulnerabilityDetails(VulnerabilityDetailsResponse vulnerabilityDetails) {
            this.vulnerabilityDetails = Objects.requireNonNull(vulnerabilityDetails);
            return this;
        }

        public GetOccurrenceResult build() {
            return new GetOccurrenceResult(attestation, buildDetails, compliance, createTime, deployment, derivedImage, discovered, dsseAttestation, envelope, installation, kind, name, noteName, remediation, resource, resourceUrl, sbom, spdxFile, spdxPackage, spdxRelationship, updateTime, upgrade, vulnerabilityDetails);
        }
    }
}