// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gameservices_v1.RealmArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:gameservices/v1:Realm")
public class Realm extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public Realm(String name, RealmArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gameservices/v1:Realm", name, args == null ? RealmArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Realm(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gameservices/v1:Realm", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Realm get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Realm(name, id, options);
    }
}