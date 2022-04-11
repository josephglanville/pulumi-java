// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudkms_v1.CryptoKeyVersionArgs;
import io.pulumi.googlenative.cloudkms_v1.outputs.ExternalProtectionLevelOptionsResponse;
import io.pulumi.googlenative.cloudkms_v1.outputs.KeyOperationAttestationResponse;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create a new CryptoKeyVersion in a CryptoKey. The server will assign the next sequential id. If unset, state will be set to ENABLED.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:cloudkms/v1:CryptoKeyVersion")
public class CryptoKeyVersion extends io.pulumi.resources.CustomResource {
    /**
     * The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
     * 
     */
    @Export(name="algorithm", type=String.class, parameters={})
    private Output<String> algorithm;

    /**
     * @return The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
     * 
     */
    public Output<String> getAlgorithm() {
        return this.algorithm;
    }
    /**
     * Statement that was generated and signed by the HSM at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only provided for key versions with protection_level HSM.
     * 
     */
    @Export(name="attestation", type=KeyOperationAttestationResponse.class, parameters={})
    private Output<KeyOperationAttestationResponse> attestation;

    /**
     * @return Statement that was generated and signed by the HSM at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only provided for key versions with protection_level HSM.
     * 
     */
    public Output<KeyOperationAttestationResponse> getAttestation() {
        return this.attestation;
    }
    /**
     * The time at which this CryptoKeyVersion was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which this CryptoKeyVersion was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The time this CryptoKeyVersion's key material was destroyed. Only present if state is DESTROYED.
     * 
     */
    @Export(name="destroyEventTime", type=String.class, parameters={})
    private Output<String> destroyEventTime;

    /**
     * @return The time this CryptoKeyVersion's key material was destroyed. Only present if state is DESTROYED.
     * 
     */
    public Output<String> getDestroyEventTime() {
        return this.destroyEventTime;
    }
    /**
     * The time this CryptoKeyVersion's key material is scheduled for destruction. Only present if state is DESTROY_SCHEDULED.
     * 
     */
    @Export(name="destroyTime", type=String.class, parameters={})
    private Output<String> destroyTime;

    /**
     * @return The time this CryptoKeyVersion's key material is scheduled for destruction. Only present if state is DESTROY_SCHEDULED.
     * 
     */
    public Output<String> getDestroyTime() {
        return this.destroyTime;
    }
    /**
     * ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * 
     */
    @Export(name="externalProtectionLevelOptions", type=ExternalProtectionLevelOptionsResponse.class, parameters={})
    private Output<ExternalProtectionLevelOptionsResponse> externalProtectionLevelOptions;

    /**
     * @return ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * 
     */
    public Output<ExternalProtectionLevelOptionsResponse> getExternalProtectionLevelOptions() {
        return this.externalProtectionLevelOptions;
    }
    /**
     * The time this CryptoKeyVersion's key material was generated.
     * 
     */
    @Export(name="generateTime", type=String.class, parameters={})
    private Output<String> generateTime;

    /**
     * @return The time this CryptoKeyVersion's key material was generated.
     * 
     */
    public Output<String> getGenerateTime() {
        return this.generateTime;
    }
    /**
     * The root cause of the most recent import failure. Only present if state is IMPORT_FAILED.
     * 
     */
    @Export(name="importFailureReason", type=String.class, parameters={})
    private Output<String> importFailureReason;

    /**
     * @return The root cause of the most recent import failure. Only present if state is IMPORT_FAILED.
     * 
     */
    public Output<String> getImportFailureReason() {
        return this.importFailureReason;
    }
    /**
     * The name of the ImportJob used in the most recent import of this CryptoKeyVersion. Only present if the underlying key material was imported.
     * 
     */
    @Export(name="importJob", type=String.class, parameters={})
    private Output<String> importJob;

    /**
     * @return The name of the ImportJob used in the most recent import of this CryptoKeyVersion. Only present if the underlying key material was imported.
     * 
     */
    public Output<String> getImportJob() {
        return this.importJob;
    }
    /**
     * The time at which this CryptoKeyVersion's key material was most recently imported.
     * 
     */
    @Export(name="importTime", type=String.class, parameters={})
    private Output<String> importTime;

    /**
     * @return The time at which this CryptoKeyVersion's key material was most recently imported.
     * 
     */
    public Output<String> getImportTime() {
        return this.importTime;
    }
    /**
     * The resource name for this CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ProtectionLevel describing how crypto operations are performed with this CryptoKeyVersion.
     * 
     */
    @Export(name="protectionLevel", type=String.class, parameters={})
    private Output<String> protectionLevel;

    /**
     * @return The ProtectionLevel describing how crypto operations are performed with this CryptoKeyVersion.
     * 
     */
    public Output<String> getProtectionLevel() {
        return this.protectionLevel;
    }
    /**
     * Whether or not this key version is eligible for reimport, by being specified as a target in ImportCryptoKeyVersionRequest.crypto_key_version.
     * 
     */
    @Export(name="reimportEligible", type=Boolean.class, parameters={})
    private Output<Boolean> reimportEligible;

    /**
     * @return Whether or not this key version is eligible for reimport, by being specified as a target in ImportCryptoKeyVersionRequest.crypto_key_version.
     * 
     */
    public Output<Boolean> getReimportEligible() {
        return this.reimportEligible;
    }
    /**
     * The current state of the CryptoKeyVersion.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the CryptoKeyVersion.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CryptoKeyVersion(String name) {
        this(name, CryptoKeyVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CryptoKeyVersion(String name, CryptoKeyVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CryptoKeyVersion(String name, CryptoKeyVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudkms/v1:CryptoKeyVersion", name, args == null ? CryptoKeyVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CryptoKeyVersion(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudkms/v1:CryptoKeyVersion", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static CryptoKeyVersion get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CryptoKeyVersion(name, id, options);
    }
}
