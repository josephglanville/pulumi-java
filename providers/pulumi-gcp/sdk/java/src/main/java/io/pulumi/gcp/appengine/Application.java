// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.appengine.ApplicationArgs;
import io.pulumi.gcp.appengine.inputs.ApplicationState;
import io.pulumi.gcp.appengine.outputs.ApplicationFeatureSettings;
import io.pulumi.gcp.appengine.outputs.ApplicationIap;
import io.pulumi.gcp.appengine.outputs.ApplicationUrlDispatchRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Allows creation and management of an App Engine application.
 * 
 * > App Engine applications cannot be deleted once they're created; you have to delete the
 *    entire project to delete the application. This provider will report the application has been
 *    successfully deleted; this is a limitation of the provider, and will go away in the future.
 *    This provider is not able to delete App Engine applications.
 * 
 * > **Warning:** All arguments including `iap.oauth2_client_secret` will be stored in the raw
 * state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Applications can be imported using the ID of the project the application belongs to, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:appengine/application:Application app your-project-id
 * ```
 * 
 */
@ResourceType(type="gcp:appengine/application:Application")
public class Application extends io.pulumi.resources.CustomResource {
    /**
     * Identifier of the app, usually `{PROJECT_ID}`
     * 
     */
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return Identifier of the app, usually `{PROJECT_ID}`
     * 
     */
    public Output<String> getAppId() {
        return this.appId;
    }
    /**
     * The domain to authenticate users with when using App Engine's User API.
     * 
     */
    @Export(name="authDomain", type=String.class, parameters={})
    private Output<String> authDomain;

    /**
     * @return The domain to authenticate users with when using App Engine's User API.
     * 
     */
    public Output<String> getAuthDomain() {
        return this.authDomain;
    }
    /**
     * The GCS bucket code is being stored in for this app.
     * 
     */
    @Export(name="codeBucket", type=String.class, parameters={})
    private Output<String> codeBucket;

    /**
     * @return The GCS bucket code is being stored in for this app.
     * 
     */
    public Output<String> getCodeBucket() {
        return this.codeBucket;
    }
    /**
     * The type of the Cloud Firestore or Cloud Datastore database associated with this application.
     * Can be `CLOUD_FIRESTORE` or `CLOUD_DATASTORE_COMPATIBILITY` for new
     * instances.  To support old instances, the value `CLOUD_DATASTORE` is accepted
     * by the provider, but will be rejected by the API.
     * 
     */
    @Export(name="databaseType", type=String.class, parameters={})
    private Output<String> databaseType;

    /**
     * @return The type of the Cloud Firestore or Cloud Datastore database associated with this application.
     * Can be `CLOUD_FIRESTORE` or `CLOUD_DATASTORE_COMPATIBILITY` for new
     * instances.  To support old instances, the value `CLOUD_DATASTORE` is accepted
     * by the provider, but will be rejected by the API.
     * 
     */
    public Output<String> getDatabaseType() {
        return this.databaseType;
    }
    /**
     * The GCS bucket content is being stored in for this app.
     * 
     */
    @Export(name="defaultBucket", type=String.class, parameters={})
    private Output<String> defaultBucket;

    /**
     * @return The GCS bucket content is being stored in for this app.
     * 
     */
    public Output<String> getDefaultBucket() {
        return this.defaultBucket;
    }
    /**
     * The default hostname for this app.
     * 
     */
    @Export(name="defaultHostname", type=String.class, parameters={})
    private Output<String> defaultHostname;

    /**
     * @return The default hostname for this app.
     * 
     */
    public Output<String> getDefaultHostname() {
        return this.defaultHostname;
    }
    /**
     * A block of optional settings to configure specific App Engine features:
     * 
     */
    @Export(name="featureSettings", type=ApplicationFeatureSettings.class, parameters={})
    private Output<ApplicationFeatureSettings> featureSettings;

    /**
     * @return A block of optional settings to configure specific App Engine features:
     * 
     */
    public Output<ApplicationFeatureSettings> getFeatureSettings() {
        return this.featureSettings;
    }
    /**
     * The GCR domain used for storing managed Docker images for this app.
     * 
     */
    @Export(name="gcrDomain", type=String.class, parameters={})
    private Output<String> gcrDomain;

    /**
     * @return The GCR domain used for storing managed Docker images for this app.
     * 
     */
    public Output<String> getGcrDomain() {
        return this.gcrDomain;
    }
    /**
     * Settings for enabling Cloud Identity Aware Proxy
     * 
     */
    @Export(name="iap", type=ApplicationIap.class, parameters={})
    private Output<ApplicationIap> iap;

    /**
     * @return Settings for enabling Cloud Identity Aware Proxy
     * 
     */
    public Output<ApplicationIap> getIap() {
        return this.iap;
    }
    /**
     * The [location](https://cloud.google.com/appengine/docs/locations)
     * to serve the app from.
     * 
     */
    @Export(name="locationId", type=String.class, parameters={})
    private Output<String> locationId;

    /**
     * @return The [location](https://cloud.google.com/appengine/docs/locations)
     * to serve the app from.
     * 
     */
    public Output<String> getLocationId() {
        return this.locationId;
    }
    /**
     * Unique name of the app, usually `apps/{PROJECT_ID}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name of the app, usually `apps/{PROJECT_ID}`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The project ID to create the application under.
     * ~>**NOTE:** GCP only accepts project ID, not project number. If you are using number,
     * you may get a "Permission denied" error.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project ID to create the application under.
     * ~>**NOTE:** GCP only accepts project ID, not project number. If you are using number,
     * you may get a "Permission denied" error.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The serving status of the app.
     * 
     */
    @Export(name="servingStatus", type=String.class, parameters={})
    private Output<String> servingStatus;

    /**
     * @return The serving status of the app.
     * 
     */
    public Output<String> getServingStatus() {
        return this.servingStatus;
    }
    /**
     * A list of dispatch rule blocks. Each block has a `domain`, `path`, and `service` field.
     * 
     */
    @Export(name="urlDispatchRules", type=List.class, parameters={ApplicationUrlDispatchRule.class})
    private Output<List<ApplicationUrlDispatchRule>> urlDispatchRules;

    /**
     * @return A list of dispatch rule blocks. Each block has a `domain`, `path`, and `service` field.
     * 
     */
    public Output<List<ApplicationUrlDispatchRule>> getUrlDispatchRules() {
        return this.urlDispatchRules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/application:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Application(String name, Output<String> id, @Nullable ApplicationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/application:Application", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Application get(String name, Output<String> id, @Nullable ApplicationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, state, options);
    }
}
