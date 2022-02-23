// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppDeploymentSlotArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * User credentials used for publishing activity.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppDeploymentSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/deployments/{id} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppDeploymentSlot")
public class WebAppDeploymentSlot extends io.pulumi.resources.CustomResource {
    /**
     * True if deployment is currently active, false if completed and null if not started.
     * 
     */
    @OutputExport(name="active", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return True if deployment is currently active, false if completed and null if not started.
     * 
     */
    public Output</* @Nullable */ Boolean> getActive() {
        return this.active;
    }
    /**
     * Who authored the deployment.
     * 
     */
    @OutputExport(name="author", type=String.class, parameters={})
    private Output</* @Nullable */ String> author;

    /**
     * @return Who authored the deployment.
     * 
     */
    public Output</* @Nullable */ String> getAuthor() {
        return this.author;
    }
    /**
     * Author email.
     * 
     */
    @OutputExport(name="authorEmail", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorEmail;

    /**
     * @return Author email.
     * 
     */
    public Output</* @Nullable */ String> getAuthorEmail() {
        return this.authorEmail;
    }
    /**
     * Who performed the deployment.
     * 
     */
    @OutputExport(name="deployer", type=String.class, parameters={})
    private Output</* @Nullable */ String> deployer;

    /**
     * @return Who performed the deployment.
     * 
     */
    public Output</* @Nullable */ String> getDeployer() {
        return this.deployer;
    }
    /**
     * Details on deployment.
     * 
     */
    @OutputExport(name="details", type=String.class, parameters={})
    private Output</* @Nullable */ String> details;

    /**
     * @return Details on deployment.
     * 
     */
    public Output</* @Nullable */ String> getDetails() {
        return this.details;
    }
    /**
     * End time.
     * 
     */
    @OutputExport(name="endTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> endTime;

    /**
     * @return End time.
     * 
     */
    public Output</* @Nullable */ String> getEndTime() {
        return this.endTime;
    }
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Details about deployment status.
     * 
     */
    @OutputExport(name="message", type=String.class, parameters={})
    private Output</* @Nullable */ String> message;

    /**
     * @return Details about deployment status.
     * 
     */
    public Output</* @Nullable */ String> getMessage() {
        return this.message;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Start time.
     * 
     */
    @OutputExport(name="startTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> startTime;

    /**
     * @return Start time.
     * 
     */
    public Output</* @Nullable */ String> getStartTime() {
        return this.startTime;
    }
    /**
     * Deployment status.
     * 
     */
    @OutputExport(name="status", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> status;

    /**
     * @return Deployment status.
     * 
     */
    public Output</* @Nullable */ Integer> getStatus() {
        return this.status;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppDeploymentSlot(String name) {
        this(name, WebAppDeploymentSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppDeploymentSlot(String name, WebAppDeploymentSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppDeploymentSlot(String name, WebAppDeploymentSlotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppDeploymentSlot", name, args == null ? WebAppDeploymentSlotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppDeploymentSlot(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppDeploymentSlot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:WebAppDeploymentSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppDeploymentSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppDeploymentSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppDeploymentSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppDeploymentSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppDeploymentSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppDeploymentSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppDeploymentSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppDeploymentSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppDeploymentSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppDeploymentSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppDeploymentSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppDeploymentSlot").build())
            ))
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
    public static WebAppDeploymentSlot get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppDeploymentSlot(name, id, options);
    }
}
