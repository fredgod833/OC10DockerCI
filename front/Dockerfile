FROM node:14.18-alpine as build

WORKDIR /app
COPY package.json package-lock.json ./
RUN npm install
COPY . .
RUN npm run build --prod
 
FROM nginx:alpine as production

COPY nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=build /app/dist/bobapp /usr/share/nginx/html


CMD ["nginx", "-g", "daemon off;"]





