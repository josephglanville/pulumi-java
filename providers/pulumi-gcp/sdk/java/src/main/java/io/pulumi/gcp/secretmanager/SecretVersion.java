// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.secretmanager.SecretVersionArgs;
import io.pulumi.gcp.secretmanager.inputs.SecretVersionState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:secretmanager/secretVersion:SecretVersion")
public class SecretVersion extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="destroyTime", type=String.class, parameters={})
    private Output<String> destroyTime;

    public Output<String> getDestroyTime() {
        return this.destroyTime;
    }
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="secret", type=String.class, parameters={})
    private Output<String> secret;

    public Output<String> getSecret() {
        return this.secret;
    }
    @OutputExport(name="secretData", type=String.class, parameters={})
    private Output<String> secretData;

    public Output<String> getSecretData() {
        return this.secretData;
    }

    public SecretVersion(String name, SecretVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:secretmanager/secretVersion:SecretVersion", name, args == null ? SecretVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SecretVersion(String name, Input<String> id, @Nullable SecretVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:secretmanager/secretVersion:SecretVersion", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SecretVersion get(String name, Input<String> id, @Nullable SecretVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecretVersion(name, id, state, options);
    }
}