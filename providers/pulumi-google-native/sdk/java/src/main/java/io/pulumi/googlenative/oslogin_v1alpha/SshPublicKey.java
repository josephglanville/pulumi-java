// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.oslogin_v1alpha;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.oslogin_v1alpha.SshPublicKeyArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create an SSH public key
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:oslogin/v1alpha:SshPublicKey")
public class SshPublicKey extends io.pulumi.resources.CustomResource {
    /**
     * An expiration time in microseconds since epoch.
     * 
     */
    @OutputExport(name="expirationTimeUsec", type=String.class, parameters={})
    private Output<String> expirationTimeUsec;

    /**
     * @return An expiration time in microseconds since epoch.
     * 
     */
    public Output<String> getExpirationTimeUsec() {
        return this.expirationTimeUsec;
    }
    /**
     * The SHA-256 fingerprint of the SSH public key.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return The SHA-256 fingerprint of the SSH public key.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    @OutputExport(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    public Output<String> getKey() {
        return this.key;
    }
    /**
     * The canonical resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The canonical resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshPublicKey(String name) {
        this(name, SshPublicKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshPublicKey(String name, SshPublicKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshPublicKey(String name, SshPublicKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:oslogin/v1alpha:SshPublicKey", name, args == null ? SshPublicKeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SshPublicKey(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:oslogin/v1alpha:SshPublicKey", name, null, makeResourceOptions(options, id));
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
    public static SshPublicKey get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SshPublicKey(name, id, options);
    }
}
