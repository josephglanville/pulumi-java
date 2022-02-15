// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KubernetesClusterStateResponse {
    private final String agonesVersionInstalled;
    private final String agonesVersionTargeted;
    private final String installationState;
    private final String kubernetesVersionInstalled;
    private final String provider;
    private final String versionInstalledErrorMessage;

    @OutputCustomType.Constructor({"agonesVersionInstalled","agonesVersionTargeted","installationState","kubernetesVersionInstalled","provider","versionInstalledErrorMessage"})
    private KubernetesClusterStateResponse(
        String agonesVersionInstalled,
        String agonesVersionTargeted,
        String installationState,
        String kubernetesVersionInstalled,
        String provider,
        String versionInstalledErrorMessage) {
        this.agonesVersionInstalled = Objects.requireNonNull(agonesVersionInstalled);
        this.agonesVersionTargeted = Objects.requireNonNull(agonesVersionTargeted);
        this.installationState = Objects.requireNonNull(installationState);
        this.kubernetesVersionInstalled = Objects.requireNonNull(kubernetesVersionInstalled);
        this.provider = Objects.requireNonNull(provider);
        this.versionInstalledErrorMessage = Objects.requireNonNull(versionInstalledErrorMessage);
    }

    public String getAgonesVersionInstalled() {
        return this.agonesVersionInstalled;
    }
    public String getAgonesVersionTargeted() {
        return this.agonesVersionTargeted;
    }
    public String getInstallationState() {
        return this.installationState;
    }
    public String getKubernetesVersionInstalled() {
        return this.kubernetesVersionInstalled;
    }
    public String getProvider() {
        return this.provider;
    }
    public String getVersionInstalledErrorMessage() {
        return this.versionInstalledErrorMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agonesVersionInstalled;
        private String agonesVersionTargeted;
        private String installationState;
        private String kubernetesVersionInstalled;
        private String provider;
        private String versionInstalledErrorMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agonesVersionInstalled = defaults.agonesVersionInstalled;
    	      this.agonesVersionTargeted = defaults.agonesVersionTargeted;
    	      this.installationState = defaults.installationState;
    	      this.kubernetesVersionInstalled = defaults.kubernetesVersionInstalled;
    	      this.provider = defaults.provider;
    	      this.versionInstalledErrorMessage = defaults.versionInstalledErrorMessage;
        }

        public Builder setAgonesVersionInstalled(String agonesVersionInstalled) {
            this.agonesVersionInstalled = Objects.requireNonNull(agonesVersionInstalled);
            return this;
        }

        public Builder setAgonesVersionTargeted(String agonesVersionTargeted) {
            this.agonesVersionTargeted = Objects.requireNonNull(agonesVersionTargeted);
            return this;
        }

        public Builder setInstallationState(String installationState) {
            this.installationState = Objects.requireNonNull(installationState);
            return this;
        }

        public Builder setKubernetesVersionInstalled(String kubernetesVersionInstalled) {
            this.kubernetesVersionInstalled = Objects.requireNonNull(kubernetesVersionInstalled);
            return this;
        }

        public Builder setProvider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }

        public Builder setVersionInstalledErrorMessage(String versionInstalledErrorMessage) {
            this.versionInstalledErrorMessage = Objects.requireNonNull(versionInstalledErrorMessage);
            return this;
        }

        public KubernetesClusterStateResponse build() {
            return new KubernetesClusterStateResponse(agonesVersionInstalled, agonesVersionTargeted, installationState, kubernetesVersionInstalled, provider, versionInstalledErrorMessage);
        }
    }
}