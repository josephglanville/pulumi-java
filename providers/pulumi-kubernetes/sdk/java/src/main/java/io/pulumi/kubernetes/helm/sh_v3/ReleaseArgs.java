// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.helm.sh_v3;

import io.pulumi.core.AssetOrArchive;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.helm.sh_v3.inputs.RepositoryOptsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReleaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReleaseArgs Empty = new ReleaseArgs();

    /**
     * If set, installation process purges chart on fail. `skipAwait` will be disabled automatically if atomic is used.
     * 
     */
    @InputImport(name="atomic")
      private final @Nullable Input<Boolean> atomic;

    public Input<Boolean> getAtomic() {
        return this.atomic == null ? Input.empty() : this.atomic;
    }

    /**
     * Chart name to be installed. A path may be used.
     * 
     */
    @InputImport(name="chart", required=true)
      private final Input<String> chart;

    public Input<String> getChart() {
        return this.chart;
    }

    /**
     * Allow deletion of new resources created in this upgrade when upgrade fails.
     * 
     */
    @InputImport(name="cleanupOnFail")
      private final @Nullable Input<Boolean> cleanupOnFail;

    public Input<Boolean> getCleanupOnFail() {
        return this.cleanupOnFail == null ? Input.empty() : this.cleanupOnFail;
    }

    @InputImport(name="compat")
      private final @Nullable Input<String> compat;

    public Input<String> getCompat() {
        return this.compat == null ? Input.empty() : this.compat;
    }

    /**
     * Create the namespace if it does not exist.
     * 
     */
    @InputImport(name="createNamespace")
      private final @Nullable Input<Boolean> createNamespace;

    public Input<Boolean> getCreateNamespace() {
        return this.createNamespace == null ? Input.empty() : this.createNamespace;
    }

    /**
     * Run helm dependency update before installing the chart.
     * 
     */
    @InputImport(name="dependencyUpdate")
      private final @Nullable Input<Boolean> dependencyUpdate;

    public Input<Boolean> getDependencyUpdate() {
        return this.dependencyUpdate == null ? Input.empty() : this.dependencyUpdate;
    }

    /**
     * Add a custom description
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Use chart development versions, too. Equivalent to version '>0.0.0-0'. If `version` is set, this is ignored.
     * 
     */
    @InputImport(name="devel")
      private final @Nullable Input<Boolean> devel;

    public Input<Boolean> getDevel() {
        return this.devel == null ? Input.empty() : this.devel;
    }

    /**
     * Prevent CRD hooks from, running, but run other hooks.  See helm install --no-crd-hook
     * 
     */
    @InputImport(name="disableCRDHooks")
      private final @Nullable Input<Boolean> disableCRDHooks;

    public Input<Boolean> getDisableCRDHooks() {
        return this.disableCRDHooks == null ? Input.empty() : this.disableCRDHooks;
    }

    /**
     * If set, the installation process will not validate rendered templates against the Kubernetes OpenAPI Schema
     * 
     */
    @InputImport(name="disableOpenapiValidation")
      private final @Nullable Input<Boolean> disableOpenapiValidation;

    public Input<Boolean> getDisableOpenapiValidation() {
        return this.disableOpenapiValidation == null ? Input.empty() : this.disableOpenapiValidation;
    }

    /**
     * Prevent hooks from running.
     * 
     */
    @InputImport(name="disableWebhooks")
      private final @Nullable Input<Boolean> disableWebhooks;

    public Input<Boolean> getDisableWebhooks() {
        return this.disableWebhooks == null ? Input.empty() : this.disableWebhooks;
    }

    /**
     * Force resource update through delete/recreate if needed.
     * 
     */
    @InputImport(name="forceUpdate")
      private final @Nullable Input<Boolean> forceUpdate;

    public Input<Boolean> getForceUpdate() {
        return this.forceUpdate == null ? Input.empty() : this.forceUpdate;
    }

    /**
     * Location of public keys used for verification. Used only if `verify` is true
     * 
     */
    @InputImport(name="keyring")
      private final @Nullable Input<String> keyring;

    public Input<String> getKeyring() {
        return this.keyring == null ? Input.empty() : this.keyring;
    }

    /**
     * Run helm lint when planning.
     * 
     */
    @InputImport(name="lint")
      private final @Nullable Input<Boolean> lint;

    public Input<Boolean> getLint() {
        return this.lint == null ? Input.empty() : this.lint;
    }

    /**
     * The rendered manifests as JSON. Not yet supported.
     * 
     */
    @InputImport(name="manifest")
      private final @Nullable Input<Map<String,Object>> manifest;

    public Input<Map<String,Object>> getManifest() {
        return this.manifest == null ? Input.empty() : this.manifest;
    }

    /**
     * Limit the maximum number of revisions saved per release. Use 0 for no limit.
     * 
     */
    @InputImport(name="maxHistory")
      private final @Nullable Input<Integer> maxHistory;

    public Input<Integer> getMaxHistory() {
        return this.maxHistory == null ? Input.empty() : this.maxHistory;
    }

    /**
     * Release name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Namespace to install the release into.
     * 
     */
    @InputImport(name="namespace")
      private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    /**
     * Postrender command to run.
     * 
     */
    @InputImport(name="postrender")
      private final @Nullable Input<String> postrender;

    public Input<String> getPostrender() {
        return this.postrender == null ? Input.empty() : this.postrender;
    }

    /**
     * Perform pods restart during upgrade/rollback.
     * 
     */
    @InputImport(name="recreatePods")
      private final @Nullable Input<Boolean> recreatePods;

    public Input<Boolean> getRecreatePods() {
        return this.recreatePods == null ? Input.empty() : this.recreatePods;
    }

    /**
     * If set, render subchart notes along with the parent.
     * 
     */
    @InputImport(name="renderSubchartNotes")
      private final @Nullable Input<Boolean> renderSubchartNotes;

    public Input<Boolean> getRenderSubchartNotes() {
        return this.renderSubchartNotes == null ? Input.empty() : this.renderSubchartNotes;
    }

    /**
     * Re-use the given name, even if that name is already used. This is unsafe in production
     * 
     */
    @InputImport(name="replace")
      private final @Nullable Input<Boolean> replace;

    public Input<Boolean> getReplace() {
        return this.replace == null ? Input.empty() : this.replace;
    }

    /**
     * Specification defining the Helm chart repository to use.
     * 
     */
    @InputImport(name="repositoryOpts")
      private final @Nullable Input<RepositoryOptsArgs> repositoryOpts;

    public Input<RepositoryOptsArgs> getRepositoryOpts() {
        return this.repositoryOpts == null ? Input.empty() : this.repositoryOpts;
    }

    /**
     * When upgrading, reset the values to the ones built into the chart.
     * 
     */
    @InputImport(name="resetValues")
      private final @Nullable Input<Boolean> resetValues;

    public Input<Boolean> getResetValues() {
        return this.resetValues == null ? Input.empty() : this.resetValues;
    }

    /**
     * Names of resources created by the release grouped by "kind/version".
     * 
     */
    @InputImport(name="resourceNames")
      private final @Nullable Input<Map<String,List<String>>> resourceNames;

    public Input<Map<String,List<String>>> getResourceNames() {
        return this.resourceNames == null ? Input.empty() : this.resourceNames;
    }

    /**
     * When upgrading, reuse the last release's values and merge in any overrides. If 'resetValues' is specified, this is ignored
     * 
     */
    @InputImport(name="reuseValues")
      private final @Nullable Input<Boolean> reuseValues;

    public Input<Boolean> getReuseValues() {
        return this.reuseValues == null ? Input.empty() : this.reuseValues;
    }

    /**
     * By default, the provider waits until all resources are in a ready state before marking the release as successful. Setting this to true will skip such await logic.
     * 
     */
    @InputImport(name="skipAwait")
      private final @Nullable Input<Boolean> skipAwait;

    public Input<Boolean> getSkipAwait() {
        return this.skipAwait == null ? Input.empty() : this.skipAwait;
    }

    /**
     * If set, no CRDs will be installed. By default, CRDs are installed if not already present.
     * 
     */
    @InputImport(name="skipCrds")
      private final @Nullable Input<Boolean> skipCrds;

    public Input<Boolean> getSkipCrds() {
        return this.skipCrds == null ? Input.empty() : this.skipCrds;
    }

    /**
     * Time in seconds to wait for any individual kubernetes operation.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * List of assets (raw yaml files). Content is read and merged with values.
     * 
     */
    @InputImport(name="valueYamlFiles")
      private final @Nullable Input<List<AssetOrArchive>> valueYamlFiles;

    public Input<List<AssetOrArchive>> getValueYamlFiles() {
        return this.valueYamlFiles == null ? Input.empty() : this.valueYamlFiles;
    }

    /**
     * Custom values set for the release.
     * 
     */
    @InputImport(name="values")
      private final @Nullable Input<Map<String,Object>> values;

    public Input<Map<String,Object>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    /**
     * Verify the package before installing it.
     * 
     */
    @InputImport(name="verify")
      private final @Nullable Input<Boolean> verify;

    public Input<Boolean> getVerify() {
        return this.verify == null ? Input.empty() : this.verify;
    }

    /**
     * Specify the exact chart version to install. If this is not specified, the latest version is installed.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * Will wait until all Jobs have been completed before marking the release as successful. This is ignored if `skipAwait` is enabled.
     * 
     */
    @InputImport(name="waitForJobs")
      private final @Nullable Input<Boolean> waitForJobs;

    public Input<Boolean> getWaitForJobs() {
        return this.waitForJobs == null ? Input.empty() : this.waitForJobs;
    }

    public ReleaseArgs(
        @Nullable Input<Boolean> atomic,
        Input<String> chart,
        @Nullable Input<Boolean> cleanupOnFail,
        @Nullable Input<String> compat,
        @Nullable Input<Boolean> createNamespace,
        @Nullable Input<Boolean> dependencyUpdate,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> devel,
        @Nullable Input<Boolean> disableCRDHooks,
        @Nullable Input<Boolean> disableOpenapiValidation,
        @Nullable Input<Boolean> disableWebhooks,
        @Nullable Input<Boolean> forceUpdate,
        @Nullable Input<String> keyring,
        @Nullable Input<Boolean> lint,
        @Nullable Input<Map<String,Object>> manifest,
        @Nullable Input<Integer> maxHistory,
        @Nullable Input<String> name,
        @Nullable Input<String> namespace,
        @Nullable Input<String> postrender,
        @Nullable Input<Boolean> recreatePods,
        @Nullable Input<Boolean> renderSubchartNotes,
        @Nullable Input<Boolean> replace,
        @Nullable Input<RepositoryOptsArgs> repositoryOpts,
        @Nullable Input<Boolean> resetValues,
        @Nullable Input<Map<String,List<String>>> resourceNames,
        @Nullable Input<Boolean> reuseValues,
        @Nullable Input<Boolean> skipAwait,
        @Nullable Input<Boolean> skipCrds,
        @Nullable Input<Integer> timeout,
        @Nullable Input<List<AssetOrArchive>> valueYamlFiles,
        @Nullable Input<Map<String,Object>> values,
        @Nullable Input<Boolean> verify,
        @Nullable Input<String> version,
        @Nullable Input<Boolean> waitForJobs) {
        this.atomic = atomic;
        this.chart = Objects.requireNonNull(chart, "expected parameter 'chart' to be non-null");
        this.cleanupOnFail = cleanupOnFail;
        this.compat = compat;
        this.createNamespace = createNamespace;
        this.dependencyUpdate = dependencyUpdate;
        this.description = description;
        this.devel = devel;
        this.disableCRDHooks = disableCRDHooks;
        this.disableOpenapiValidation = disableOpenapiValidation;
        this.disableWebhooks = disableWebhooks;
        this.forceUpdate = forceUpdate;
        this.keyring = keyring;
        this.lint = lint;
        this.manifest = manifest;
        this.maxHistory = maxHistory;
        this.name = name;
        this.namespace = namespace;
        this.postrender = postrender;
        this.recreatePods = recreatePods;
        this.renderSubchartNotes = renderSubchartNotes;
        this.replace = replace;
        this.repositoryOpts = repositoryOpts;
        this.resetValues = resetValues;
        this.resourceNames = resourceNames;
        this.reuseValues = reuseValues;
        this.skipAwait = skipAwait;
        this.skipCrds = skipCrds;
        this.timeout = timeout;
        this.valueYamlFiles = valueYamlFiles;
        this.values = values;
        this.verify = verify;
        this.version = version;
        this.waitForJobs = waitForJobs;
    }

    private ReleaseArgs() {
        this.atomic = Input.empty();
        this.chart = Input.empty();
        this.cleanupOnFail = Input.empty();
        this.compat = Input.empty();
        this.createNamespace = Input.empty();
        this.dependencyUpdate = Input.empty();
        this.description = Input.empty();
        this.devel = Input.empty();
        this.disableCRDHooks = Input.empty();
        this.disableOpenapiValidation = Input.empty();
        this.disableWebhooks = Input.empty();
        this.forceUpdate = Input.empty();
        this.keyring = Input.empty();
        this.lint = Input.empty();
        this.manifest = Input.empty();
        this.maxHistory = Input.empty();
        this.name = Input.empty();
        this.namespace = Input.empty();
        this.postrender = Input.empty();
        this.recreatePods = Input.empty();
        this.renderSubchartNotes = Input.empty();
        this.replace = Input.empty();
        this.repositoryOpts = Input.empty();
        this.resetValues = Input.empty();
        this.resourceNames = Input.empty();
        this.reuseValues = Input.empty();
        this.skipAwait = Input.empty();
        this.skipCrds = Input.empty();
        this.timeout = Input.empty();
        this.valueYamlFiles = Input.empty();
        this.values = Input.empty();
        this.verify = Input.empty();
        this.version = Input.empty();
        this.waitForJobs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReleaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> atomic;
        private Input<String> chart;
        private @Nullable Input<Boolean> cleanupOnFail;
        private @Nullable Input<String> compat;
        private @Nullable Input<Boolean> createNamespace;
        private @Nullable Input<Boolean> dependencyUpdate;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> devel;
        private @Nullable Input<Boolean> disableCRDHooks;
        private @Nullable Input<Boolean> disableOpenapiValidation;
        private @Nullable Input<Boolean> disableWebhooks;
        private @Nullable Input<Boolean> forceUpdate;
        private @Nullable Input<String> keyring;
        private @Nullable Input<Boolean> lint;
        private @Nullable Input<Map<String,Object>> manifest;
        private @Nullable Input<Integer> maxHistory;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namespace;
        private @Nullable Input<String> postrender;
        private @Nullable Input<Boolean> recreatePods;
        private @Nullable Input<Boolean> renderSubchartNotes;
        private @Nullable Input<Boolean> replace;
        private @Nullable Input<RepositoryOptsArgs> repositoryOpts;
        private @Nullable Input<Boolean> resetValues;
        private @Nullable Input<Map<String,List<String>>> resourceNames;
        private @Nullable Input<Boolean> reuseValues;
        private @Nullable Input<Boolean> skipAwait;
        private @Nullable Input<Boolean> skipCrds;
        private @Nullable Input<Integer> timeout;
        private @Nullable Input<List<AssetOrArchive>> valueYamlFiles;
        private @Nullable Input<Map<String,Object>> values;
        private @Nullable Input<Boolean> verify;
        private @Nullable Input<String> version;
        private @Nullable Input<Boolean> waitForJobs;

        public Builder() {
    	      // Empty
        }

        public Builder(ReleaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.atomic = defaults.atomic;
    	      this.chart = defaults.chart;
    	      this.cleanupOnFail = defaults.cleanupOnFail;
    	      this.compat = defaults.compat;
    	      this.createNamespace = defaults.createNamespace;
    	      this.dependencyUpdate = defaults.dependencyUpdate;
    	      this.description = defaults.description;
    	      this.devel = defaults.devel;
    	      this.disableCRDHooks = defaults.disableCRDHooks;
    	      this.disableOpenapiValidation = defaults.disableOpenapiValidation;
    	      this.disableWebhooks = defaults.disableWebhooks;
    	      this.forceUpdate = defaults.forceUpdate;
    	      this.keyring = defaults.keyring;
    	      this.lint = defaults.lint;
    	      this.manifest = defaults.manifest;
    	      this.maxHistory = defaults.maxHistory;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.postrender = defaults.postrender;
    	      this.recreatePods = defaults.recreatePods;
    	      this.renderSubchartNotes = defaults.renderSubchartNotes;
    	      this.replace = defaults.replace;
    	      this.repositoryOpts = defaults.repositoryOpts;
    	      this.resetValues = defaults.resetValues;
    	      this.resourceNames = defaults.resourceNames;
    	      this.reuseValues = defaults.reuseValues;
    	      this.skipAwait = defaults.skipAwait;
    	      this.skipCrds = defaults.skipCrds;
    	      this.timeout = defaults.timeout;
    	      this.valueYamlFiles = defaults.valueYamlFiles;
    	      this.values = defaults.values;
    	      this.verify = defaults.verify;
    	      this.version = defaults.version;
    	      this.waitForJobs = defaults.waitForJobs;
        }

        public Builder setAtomic(@Nullable Input<Boolean> atomic) {
            this.atomic = atomic;
            return this;
        }

        public Builder setAtomic(@Nullable Boolean atomic) {
            this.atomic = Input.ofNullable(atomic);
            return this;
        }

        public Builder setChart(Input<String> chart) {
            this.chart = Objects.requireNonNull(chart);
            return this;
        }

        public Builder setChart(String chart) {
            this.chart = Input.of(Objects.requireNonNull(chart));
            return this;
        }

        public Builder setCleanupOnFail(@Nullable Input<Boolean> cleanupOnFail) {
            this.cleanupOnFail = cleanupOnFail;
            return this;
        }

        public Builder setCleanupOnFail(@Nullable Boolean cleanupOnFail) {
            this.cleanupOnFail = Input.ofNullable(cleanupOnFail);
            return this;
        }

        public Builder setCompat(@Nullable Input<String> compat) {
            this.compat = compat;
            return this;
        }

        public Builder setCompat(@Nullable String compat) {
            this.compat = Input.ofNullable(compat);
            return this;
        }

        public Builder setCreateNamespace(@Nullable Input<Boolean> createNamespace) {
            this.createNamespace = createNamespace;
            return this;
        }

        public Builder setCreateNamespace(@Nullable Boolean createNamespace) {
            this.createNamespace = Input.ofNullable(createNamespace);
            return this;
        }

        public Builder setDependencyUpdate(@Nullable Input<Boolean> dependencyUpdate) {
            this.dependencyUpdate = dependencyUpdate;
            return this;
        }

        public Builder setDependencyUpdate(@Nullable Boolean dependencyUpdate) {
            this.dependencyUpdate = Input.ofNullable(dependencyUpdate);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDevel(@Nullable Input<Boolean> devel) {
            this.devel = devel;
            return this;
        }

        public Builder setDevel(@Nullable Boolean devel) {
            this.devel = Input.ofNullable(devel);
            return this;
        }

        public Builder setDisableCRDHooks(@Nullable Input<Boolean> disableCRDHooks) {
            this.disableCRDHooks = disableCRDHooks;
            return this;
        }

        public Builder setDisableCRDHooks(@Nullable Boolean disableCRDHooks) {
            this.disableCRDHooks = Input.ofNullable(disableCRDHooks);
            return this;
        }

        public Builder setDisableOpenapiValidation(@Nullable Input<Boolean> disableOpenapiValidation) {
            this.disableOpenapiValidation = disableOpenapiValidation;
            return this;
        }

        public Builder setDisableOpenapiValidation(@Nullable Boolean disableOpenapiValidation) {
            this.disableOpenapiValidation = Input.ofNullable(disableOpenapiValidation);
            return this;
        }

        public Builder setDisableWebhooks(@Nullable Input<Boolean> disableWebhooks) {
            this.disableWebhooks = disableWebhooks;
            return this;
        }

        public Builder setDisableWebhooks(@Nullable Boolean disableWebhooks) {
            this.disableWebhooks = Input.ofNullable(disableWebhooks);
            return this;
        }

        public Builder setForceUpdate(@Nullable Input<Boolean> forceUpdate) {
            this.forceUpdate = forceUpdate;
            return this;
        }

        public Builder setForceUpdate(@Nullable Boolean forceUpdate) {
            this.forceUpdate = Input.ofNullable(forceUpdate);
            return this;
        }

        public Builder setKeyring(@Nullable Input<String> keyring) {
            this.keyring = keyring;
            return this;
        }

        public Builder setKeyring(@Nullable String keyring) {
            this.keyring = Input.ofNullable(keyring);
            return this;
        }

        public Builder setLint(@Nullable Input<Boolean> lint) {
            this.lint = lint;
            return this;
        }

        public Builder setLint(@Nullable Boolean lint) {
            this.lint = Input.ofNullable(lint);
            return this;
        }

        public Builder setManifest(@Nullable Input<Map<String,Object>> manifest) {
            this.manifest = manifest;
            return this;
        }

        public Builder setManifest(@Nullable Map<String,Object> manifest) {
            this.manifest = Input.ofNullable(manifest);
            return this;
        }

        public Builder setMaxHistory(@Nullable Input<Integer> maxHistory) {
            this.maxHistory = maxHistory;
            return this;
        }

        public Builder setMaxHistory(@Nullable Integer maxHistory) {
            this.maxHistory = Input.ofNullable(maxHistory);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public Builder setPostrender(@Nullable Input<String> postrender) {
            this.postrender = postrender;
            return this;
        }

        public Builder setPostrender(@Nullable String postrender) {
            this.postrender = Input.ofNullable(postrender);
            return this;
        }

        public Builder setRecreatePods(@Nullable Input<Boolean> recreatePods) {
            this.recreatePods = recreatePods;
            return this;
        }

        public Builder setRecreatePods(@Nullable Boolean recreatePods) {
            this.recreatePods = Input.ofNullable(recreatePods);
            return this;
        }

        public Builder setRenderSubchartNotes(@Nullable Input<Boolean> renderSubchartNotes) {
            this.renderSubchartNotes = renderSubchartNotes;
            return this;
        }

        public Builder setRenderSubchartNotes(@Nullable Boolean renderSubchartNotes) {
            this.renderSubchartNotes = Input.ofNullable(renderSubchartNotes);
            return this;
        }

        public Builder setReplace(@Nullable Input<Boolean> replace) {
            this.replace = replace;
            return this;
        }

        public Builder setReplace(@Nullable Boolean replace) {
            this.replace = Input.ofNullable(replace);
            return this;
        }

        public Builder setRepositoryOpts(@Nullable Input<RepositoryOptsArgs> repositoryOpts) {
            this.repositoryOpts = repositoryOpts;
            return this;
        }

        public Builder setRepositoryOpts(@Nullable RepositoryOptsArgs repositoryOpts) {
            this.repositoryOpts = Input.ofNullable(repositoryOpts);
            return this;
        }

        public Builder setResetValues(@Nullable Input<Boolean> resetValues) {
            this.resetValues = resetValues;
            return this;
        }

        public Builder setResetValues(@Nullable Boolean resetValues) {
            this.resetValues = Input.ofNullable(resetValues);
            return this;
        }

        public Builder setResourceNames(@Nullable Input<Map<String,List<String>>> resourceNames) {
            this.resourceNames = resourceNames;
            return this;
        }

        public Builder setResourceNames(@Nullable Map<String,List<String>> resourceNames) {
            this.resourceNames = Input.ofNullable(resourceNames);
            return this;
        }

        public Builder setReuseValues(@Nullable Input<Boolean> reuseValues) {
            this.reuseValues = reuseValues;
            return this;
        }

        public Builder setReuseValues(@Nullable Boolean reuseValues) {
            this.reuseValues = Input.ofNullable(reuseValues);
            return this;
        }

        public Builder setSkipAwait(@Nullable Input<Boolean> skipAwait) {
            this.skipAwait = skipAwait;
            return this;
        }

        public Builder setSkipAwait(@Nullable Boolean skipAwait) {
            this.skipAwait = Input.ofNullable(skipAwait);
            return this;
        }

        public Builder setSkipCrds(@Nullable Input<Boolean> skipCrds) {
            this.skipCrds = skipCrds;
            return this;
        }

        public Builder setSkipCrds(@Nullable Boolean skipCrds) {
            this.skipCrds = Input.ofNullable(skipCrds);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setValueYamlFiles(@Nullable Input<List<AssetOrArchive>> valueYamlFiles) {
            this.valueYamlFiles = valueYamlFiles;
            return this;
        }

        public Builder setValueYamlFiles(@Nullable List<AssetOrArchive> valueYamlFiles) {
            this.valueYamlFiles = Input.ofNullable(valueYamlFiles);
            return this;
        }

        public Builder setValues(@Nullable Input<Map<String,Object>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable Map<String,Object> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public Builder setVerify(@Nullable Input<Boolean> verify) {
            this.verify = verify;
            return this;
        }

        public Builder setVerify(@Nullable Boolean verify) {
            this.verify = Input.ofNullable(verify);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setWaitForJobs(@Nullable Input<Boolean> waitForJobs) {
            this.waitForJobs = waitForJobs;
            return this;
        }

        public Builder setWaitForJobs(@Nullable Boolean waitForJobs) {
            this.waitForJobs = Input.ofNullable(waitForJobs);
            return this;
        }
        public ReleaseArgs build() {
            return new ReleaseArgs(atomic, chart, cleanupOnFail, compat, createNamespace, dependencyUpdate, description, devel, disableCRDHooks, disableOpenapiValidation, disableWebhooks, forceUpdate, keyring, lint, manifest, maxHistory, name, namespace, postrender, recreatePods, renderSubchartNotes, replace, repositoryOpts, resetValues, resourceNames, reuseValues, skipAwait, skipCrds, timeout, valueYamlFiles, values, verify, version, waitForJobs);
        }
    }
}
