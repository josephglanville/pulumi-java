// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.docker.Utilities;
import io.pulumi.docker.inputs.ProviderRegistryAuthArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * PEM-encoded content of Docker host CA certificate
     * 
     */
    @Import(name="caMaterial")
      private final @Nullable Output<String> caMaterial;

    public Output<String> getCaMaterial() {
        return this.caMaterial == null ? Output.empty() : this.caMaterial;
    }

    /**
     * PEM-encoded content of Docker client certificate
     * 
     */
    @Import(name="certMaterial")
      private final @Nullable Output<String> certMaterial;

    public Output<String> getCertMaterial() {
        return this.certMaterial == null ? Output.empty() : this.certMaterial;
    }

    /**
     * Path to directory with Docker TLS config
     * 
     */
    @Import(name="certPath")
      private final @Nullable Output<String> certPath;

    public Output<String> getCertPath() {
        return this.certPath == null ? Output.empty() : this.certPath;
    }

    /**
     * The Docker daemon address
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Output.empty() : this.host;
    }

    /**
     * PEM-encoded content of Docker client private key
     * 
     */
    @Import(name="keyMaterial")
      private final @Nullable Output<String> keyMaterial;

    public Output<String> getKeyMaterial() {
        return this.keyMaterial == null ? Output.empty() : this.keyMaterial;
    }

    @Import(name="registryAuth", json=true)
      private final @Nullable Output<List<ProviderRegistryAuthArgs>> registryAuth;

    public Output<List<ProviderRegistryAuthArgs>> getRegistryAuth() {
        return this.registryAuth == null ? Output.empty() : this.registryAuth;
    }

    public ProviderArgs(
        @Nullable Output<String> caMaterial,
        @Nullable Output<String> certMaterial,
        @Nullable Output<String> certPath,
        @Nullable Output<String> host,
        @Nullable Output<String> keyMaterial,
        @Nullable Output<List<ProviderRegistryAuthArgs>> registryAuth) {
        this.caMaterial = caMaterial;
        this.certMaterial = certMaterial;
        this.certPath = certPath;
        this.host = host == null ? Output.ofNullable(Utilities.getEnv("DOCKER_HOST").orElse(null) == null ? "unix:///var/run/docker.sock" : Utilities.getEnv("DOCKER_HOST").orElse(null)) : host;
        this.keyMaterial = keyMaterial;
        this.registryAuth = registryAuth;
    }

    private ProviderArgs() {
        this.caMaterial = Output.empty();
        this.certMaterial = Output.empty();
        this.certPath = Output.empty();
        this.host = Output.empty();
        this.keyMaterial = Output.empty();
        this.registryAuth = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> caMaterial;
        private @Nullable Output<String> certMaterial;
        private @Nullable Output<String> certPath;
        private @Nullable Output<String> host;
        private @Nullable Output<String> keyMaterial;
        private @Nullable Output<List<ProviderRegistryAuthArgs>> registryAuth;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caMaterial = defaults.caMaterial;
    	      this.certMaterial = defaults.certMaterial;
    	      this.certPath = defaults.certPath;
    	      this.host = defaults.host;
    	      this.keyMaterial = defaults.keyMaterial;
    	      this.registryAuth = defaults.registryAuth;
        }

        public Builder caMaterial(@Nullable Output<String> caMaterial) {
            this.caMaterial = caMaterial;
            return this;
        }
        public Builder caMaterial(@Nullable String caMaterial) {
            this.caMaterial = Output.ofNullable(caMaterial);
            return this;
        }
        public Builder certMaterial(@Nullable Output<String> certMaterial) {
            this.certMaterial = certMaterial;
            return this;
        }
        public Builder certMaterial(@Nullable String certMaterial) {
            this.certMaterial = Output.ofNullable(certMaterial);
            return this;
        }
        public Builder certPath(@Nullable Output<String> certPath) {
            this.certPath = certPath;
            return this;
        }
        public Builder certPath(@Nullable String certPath) {
            this.certPath = Output.ofNullable(certPath);
            return this;
        }
        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = Output.ofNullable(host);
            return this;
        }
        public Builder keyMaterial(@Nullable Output<String> keyMaterial) {
            this.keyMaterial = keyMaterial;
            return this;
        }
        public Builder keyMaterial(@Nullable String keyMaterial) {
            this.keyMaterial = Output.ofNullable(keyMaterial);
            return this;
        }
        public Builder registryAuth(@Nullable Output<List<ProviderRegistryAuthArgs>> registryAuth) {
            this.registryAuth = registryAuth;
            return this;
        }
        public Builder registryAuth(@Nullable List<ProviderRegistryAuthArgs> registryAuth) {
            this.registryAuth = Output.ofNullable(registryAuth);
            return this;
        }
        public Builder registryAuth(ProviderRegistryAuthArgs... registryAuth) {
            return registryAuth(List.of(registryAuth));
        }        public ProviderArgs build() {
            return new ProviderArgs(caMaterial, certMaterial, certPath, host, keyMaterial, registryAuth);
        }
    }
}
