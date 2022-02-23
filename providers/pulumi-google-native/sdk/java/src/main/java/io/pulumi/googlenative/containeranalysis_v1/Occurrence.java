// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.containeranalysis_v1.OccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1.outputs.AttestationOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.BuildOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.ComplianceOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.DSSEAttestationOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.DeploymentOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.DiscoveryOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.EnvelopeResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.ImageOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.PackageOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.UpgradeOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.VulnerabilityOccurrenceResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new occurrence.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:containeranalysis/v1:Occurrence")
public class Occurrence extends io.pulumi.resources.CustomResource {
    /**
     * Describes an attestation of an artifact.
     * 
     */
    @OutputExport(name="attestation", type=AttestationOccurrenceResponse.class, parameters={})
    private Output<AttestationOccurrenceResponse> attestation;

    /**
     * @return Describes an attestation of an artifact.
     * 
     */
    public Output<AttestationOccurrenceResponse> getAttestation() {
        return this.attestation;
    }
    /**
     * Describes a verifiable build.
     * 
     */
    @OutputExport(name="build", type=BuildOccurrenceResponse.class, parameters={})
    private Output<BuildOccurrenceResponse> build;

    /**
     * @return Describes a verifiable build.
     * 
     */
    public Output<BuildOccurrenceResponse> getBuild() {
        return this.build;
    }
    /**
     * Describes a compliance violation on a linked resource.
     * 
     */
    @OutputExport(name="compliance", type=ComplianceOccurrenceResponse.class, parameters={})
    private Output<ComplianceOccurrenceResponse> compliance;

    /**
     * @return Describes a compliance violation on a linked resource.
     * 
     */
    public Output<ComplianceOccurrenceResponse> getCompliance() {
        return this.compliance;
    }
    /**
     * The time this occurrence was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time this occurrence was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Describes the deployment of an artifact on a runtime.
     * 
     */
    @OutputExport(name="deployment", type=DeploymentOccurrenceResponse.class, parameters={})
    private Output<DeploymentOccurrenceResponse> deployment;

    /**
     * @return Describes the deployment of an artifact on a runtime.
     * 
     */
    public Output<DeploymentOccurrenceResponse> getDeployment() {
        return this.deployment;
    }
    /**
     * Describes when a resource was discovered.
     * 
     */
    @OutputExport(name="discovery", type=DiscoveryOccurrenceResponse.class, parameters={})
    private Output<DiscoveryOccurrenceResponse> discovery;

    /**
     * @return Describes when a resource was discovered.
     * 
     */
    public Output<DiscoveryOccurrenceResponse> getDiscovery() {
        return this.discovery;
    }
    /**
     * Describes an attestation of an artifact using dsse.
     * 
     */
    @OutputExport(name="dsseAttestation", type=DSSEAttestationOccurrenceResponse.class, parameters={})
    private Output<DSSEAttestationOccurrenceResponse> dsseAttestation;

    /**
     * @return Describes an attestation of an artifact using dsse.
     * 
     */
    public Output<DSSEAttestationOccurrenceResponse> getDsseAttestation() {
        return this.dsseAttestation;
    }
    /**
     * https://github.com/secure-systems-lab/dsse
     * 
     */
    @OutputExport(name="envelope", type=EnvelopeResponse.class, parameters={})
    private Output<EnvelopeResponse> envelope;

    /**
     * @return https://github.com/secure-systems-lab/dsse
     * 
     */
    public Output<EnvelopeResponse> getEnvelope() {
        return this.envelope;
    }
    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
     */
    @OutputExport(name="image", type=ImageOccurrenceResponse.class, parameters={})
    private Output<ImageOccurrenceResponse> image;

    /**
     * @return Describes how this resource derives from the basis in the associated note.
     * 
     */
    public Output<ImageOccurrenceResponse> getImage() {
        return this.image;
    }
    /**
     * This explicitly denotes which of the occurrence details are specified. This field can be used as a filter in list requests.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return This explicitly denotes which of the occurrence details are specified. This field can be used as a filter in list requests.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
     * 
     */
    @OutputExport(name="noteName", type=String.class, parameters={})
    private Output<String> noteName;

    /**
     * @return Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
     * 
     */
    public Output<String> getNoteName() {
        return this.noteName;
    }
    /**
     * Describes the installation of a package on the linked resource.
     * 
     */
    @OutputExport(name="package", type=PackageOccurrenceResponse.class, parameters={})
    private Output<PackageOccurrenceResponse> $package;

    /**
     * @return Describes the installation of a package on the linked resource.
     * 
     */
    public Output<PackageOccurrenceResponse> get$package() {
        return this.$package;
    }
    /**
     * A description of actions that can be taken to remedy the note.
     * 
     */
    @OutputExport(name="remediation", type=String.class, parameters={})
    private Output<String> remediation;

    /**
     * @return A description of actions that can be taken to remedy the note.
     * 
     */
    public Output<String> getRemediation() {
        return this.remediation;
    }
    /**
     * Immutable. A URI that represents the resource for which the occurrence applies. For example, `https://gcr.io/project/image@sha256:123abc` for a Docker image.
     * 
     */
    @OutputExport(name="resourceUri", type=String.class, parameters={})
    private Output<String> resourceUri;

    /**
     * @return Immutable. A URI that represents the resource for which the occurrence applies. For example, `https://gcr.io/project/image@sha256:123abc` for a Docker image.
     * 
     */
    public Output<String> getResourceUri() {
        return this.resourceUri;
    }
    /**
     * The time this occurrence was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time this occurrence was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Describes an available package upgrade on the linked resource.
     * 
     */
    @OutputExport(name="upgrade", type=UpgradeOccurrenceResponse.class, parameters={})
    private Output<UpgradeOccurrenceResponse> upgrade;

    /**
     * @return Describes an available package upgrade on the linked resource.
     * 
     */
    public Output<UpgradeOccurrenceResponse> getUpgrade() {
        return this.upgrade;
    }
    /**
     * Describes a security vulnerability.
     * 
     */
    @OutputExport(name="vulnerability", type=VulnerabilityOccurrenceResponse.class, parameters={})
    private Output<VulnerabilityOccurrenceResponse> vulnerability;

    /**
     * @return Describes a security vulnerability.
     * 
     */
    public Output<VulnerabilityOccurrenceResponse> getVulnerability() {
        return this.vulnerability;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Occurrence(String name) {
        this(name, OccurrenceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Occurrence(String name, OccurrenceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Occurrence(String name, OccurrenceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:containeranalysis/v1:Occurrence", name, args == null ? OccurrenceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Occurrence(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:containeranalysis/v1:Occurrence", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Occurrence get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Occurrence(name, id, options);
    }
}
